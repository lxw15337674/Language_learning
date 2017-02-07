#metaclass
"""除了使用type()动态创建类以外，要控制类的创建行为，还可以使用metaclass
mataclass，直译为元类，简单的解释是：
当定义类之后，就可以根据类创建出实例。
如果想创建出类，可以先定义metaclass，然后创建类，最后创建实例。
metaclass是py面向对象最难理解的魔术代码。先看简单的例子，metaclass可以给自定义的
MyList增加一个add方法："""
#定义listMetaclass ，通常metaclass的类名是以Metaclass结尾，已表示这是一个metaclass
#metaclass是类的模版，所以必须以type类型派生
class ListMetaclass(type):
       def __new__(cls,name,bases,attrs):
              attrs['add'] = lambda self,value:self.append(value)
              return type.__new__(cls,name,bases,attrs)
#定义类的时候还要指示使用ListMetaclass来定制类，传入关键字参数metaclass：
class MyList(list,metaclass=ListMetaclass):
       pass
"""当我们传入关键字参数metaclass时，他指示py解释器在创建MyList时，要通过
ListMetaclass.__new__()来创建，我们可以修改类的定义，比如，加上新的方法，然后
返回修改后的定义。
__new__()方法接收到的参数依次是：
1.当前准备创建的类的对象：
2.类的名字：
3.类继承的父类集合：
4.类的方法集合"""
#测试Mylist是否可以调用add()方法
L = MyList()
L.add(1)
print(L)
"""而普通的list没有add()方法会报错例如:
L2 = list()
L2.add(1)"""

"""动态修改，总会遇到需要通过metaclass修改类定义的，ORM就是一个典型的例子
ORM全称"Object Relational Mapping",即对象-关系映射，就是把关系数据库的一行映射
为一个对象，也就是一个类对应一个表，这样，写代码就不用直接操作SQL语句。
要编写一个ORM框架，所有的类都只能动态定义，因为只有使用者才能根据标的结构定义出
对应的类"""
#编写一个ORM框架
##编写底层模块的第一步，就是先把调用接口写出来。
"""比如，使用者如果使用这个ORM框架，想定义一个User类来操作对西瓜呢的数据表User"""
class User(Model):
       #定义类的属性到列的映射：
       id = IntegerField('id')
       name = StringField('username')
       email = StringField('email')
       password = StringField('password')
###创建一个实例
u = User(id=12345,name='lixiwang',email='404174262@qq.com',password='my-pwd'
###保存到数据库：
u.save()
"""其中，父类Model和属性类型StringField，IntegerField是由ORM框架提供的，剩下的
魔方方法比如save()全部由metaclass自动完成。虽然metaclass的编写比较复杂，但ORM
的使用者用起来会比较简单。
现在，按照上面的接口来实现该ORM"""
##定义Field类,它负责保存数据库表的字段名和字段类型：
class Field(object):
       def __init__(self,name,column_type):
         self.name = name
         self.colum_type = column_type
       def __str__(self):
         return'<%s:%s>' % (self.__class__.__name__,self.name)
##在Field的基础上，进一步定义各种类型的Field
class StringField(Field):
       def __init__(self,name):
         super(StringField,self).__init__(name,'varchar(100)')
class IntegerField(Field):
       def __init__(self, name):
         super(IntegerField, self).__init__(name, 'bigint')
##编写最复杂的ModelMetaclass
class ModelMetaclass(type):
       def __new__(cls,name,bases,attrs):
         if name=='Model':#如果当前创建对象为Model的实例则不做操作(因为Model没有属性 做了也白做)
                return type.__new__(clas,name,bases,attrs)
         print('Found model: %s' % name)#打印当前实例的类名称
         mappings = dict()#创建一个空的字典
         for k, v in attrs.items():# //attrs应该是存放了类的所有属性以及方法的字典,我的理解是在python中一切都是对象. 方法的类型为<class 'function'> 值为形如<function aaa at 0x10e4839d8>的内存地址.可以理解为方法是一个function的实例.这里k是属性或方法的类型,v是属性或方法的值
                if isinstance(v,Field): #如果v是Field的实例对象
                       print('Found mapping:%s ==>%s' % (k,v))
                       mappings[k] = v #将其添加到mappings字典中
         for k in mappings.keys():
                attrs.pop(k) #最后正在创建的对象 添加两个属性  __mappings__和 __table__
         attrs['__mappings__'] = mappings #保存属性和列的映射关系
         attrs['__table__'] = name #假设表名和类名一致
         return type.__new__(cls,name,bases,attrs)
##基类Model:
class Model(dict,metaclass = ModelMetaclass):
       def __init__(self,**kw):
         super(Model,self).__init__(**kw)
       def __getattr__(self,key):
         try:
                return self[key]
         except KeyError:
         raise AttribureError(r"'Moidel' object has no attribure '%s'" %key)

       def __setattr__(self,key,value):
         self[key] = value
       def save(self):
         fields = []
         params = []
         args = []
         for k,v in self.__mappings__.items():
                fields.append(v,name)
                params.append('?')
                args.append(getattr(self,k,None))
         sql = 'insert into %s (%s) value (%s)' % (self.__table__,','.join(fields),','.jion(params))
         print('SQL:%s' %sql)
         print('ARGS: %s' %str(args))
"""当用户定义一个class User(Model)时，Python解释器首先在当前类User的定义中
查找metaclass，如果没有找到，就在父类Model中查找metaclass，找到后就使用Model中
定义的metaclass的ModelMetaclass来创建User类，也就是说Metaclass可以隐式地继承到
子类。
在ModelMetaclass中，一共做了几件事情：
1.排除掉对Model类的修改；
2.在当前类（比如User）中查找定义的类的所有属性，如果找到一个Field属性，就把它保存
  到一个__mappings__的dict中，同时从类属性中删除该Field属性，否则，容易造成运行时
  错误（实例的属性会遮盖类的同名属性）；
3.把表名保存到__table__中，这里简化为表名默认为类名。

在Model类中，就可以定义各种操作数据库的方法，比如save()，delete()，find()，update等等。
我们实现了save()方法，把一个实例保存到数据库中。因为有表名，属性到字段的映射和属
性值的集合，就可以构造出INSERT语句。
#编写代码试试:
u = User(id=12345, name='Michael', email='test@orm.org', password='my-pwd')
u.save()
         输出如下：

Found model: User
Found mapping: email ==> <StringField:email>
Found mapping: password ==> <StringField:password>
Found mapping: id ==> <IntegerField:uid>
Found mapping: name ==> <StringField:username>
SQL: insert into User (password,email,username,id) values (?,?,?,?)
ARGS: ['my-pwd', 'test@orm.org', 'Michael', 12345]
可以看到，save()方法已经打印出了可执行的SQL语句，以及参数列表，只需要真正连接到数据库，执行该SQL语句，就可以完成真正的功能。

不到100行代码，我们就通过metaclass实现了一个精简的ORM框架。"""

        
       
