#__getattr__(获取属性)

"""正常情况下.当我们调用类的方法或属性时，如果不存在，就会报错。比如定义Student类"""
class Student(object):
       def __init__(self):
              self.name = 'lixiwang'
"""可以调用name属性，但调用不存在的score属性，就会报错，汇报稿没有找到score这个
attribute(属性）
为避免这个错误，除了可以加上一个score属性外，"""
#py还有另一个机制，就是写一个__getattr__()方法,动态返回一个属性
class Student(object):
       def __init__(self):
              self.name = 'lixiwang'
       def __getattr__(self,attr):
              if attr=='score':
                     return 99
"""当调用不存在的属性时，比如score，Python解释器会试图调用__getattr__(self,
'score')来尝试获得属性，这样，我们就有机会返回score的值"""
s =Student()
print(s.name)
print(s.score)
print(s.bfdbdb) #返回None


#返回函数也是完全可以的：
class Student(object):
       def __getattr__(self, attr):
              if attr=='age':
                     return lambda: 25
'''但是调用函数需要变为'''
s =Student()
print(s.age())
print(s.name)
"""任意调用如s.abc都会默认返回None，也可以按照约定设定抛出AttributeError的错误"""
class Student(object):
       def __getattr__(self,attr):
              if attr=='age':
                     return lambda:25
              raise AttributeError('这里是错误：%s' % attr)
s =Student()
print(s.asd)
"""AttribureError报错后就不会继续进行下面的代码"""


"""如果要写SDK，给每个URL对应的API都写一个方法，那得累死，而且，API一旦改动，
SDK也要改。"""
#利用完全动态的__getattr__,我们可以写出一个链式调用：
class Chain(object):
    def __init__(self, path=''):
        self._path = path
    def __getattr__(self, path):
        return Chain('%s/%s' % (self._path, path))
    def __str__(self):
        return self._path
    __repr__ = __str__
print(Chain().status.user.timeline.list)#输出'/status/user/timeline/list'
"""这样，无论API怎么变，SDK都可以根据URL实现完全动态的调用，而且，不随API增加而
改变：
还有些REST API会把参数放到URL中，比如github的API：
GET /users/:user/repos
调用时，需要把:user替换为实际用户名。如果我们能写出这样的链式调用：
Chain().users('michael').repos
就可以非常方便地调用API了。
