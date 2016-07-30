##定制类

#__str__
#定义一个student类，打印一个实例：
class Student(object):
       def __init__(self, name):
              self.name = name             
print(Student('lixiwang'))

#为了让打印的好看，只需要定义__str__()方法，返回一个好看的字符串
class Student(object):
        def __init__(self, name):
               self.name = name
        def __str__(self):  
               return 'Student object (name:%s)' %self.name
print(Student('lixiwang'))
"""这样打印出来的实例，不但好看，而且容易看出实例内部重要的数据。
但是细心的朋友会发现直接敲变量不用print，打印出来的实例还是不好看：
>>> s = Student('Michael')
>>> s
<__main__.Student object at 0x109afb310>
这是因为直接显示变量调用的不是__str__()，而是__repr__()，两者的区别
是__str__()返回用户看到的字符串，而__repr__()返回程序开发者看到的字
符串，也就是说，__repr__()是为调试服务的。
解决办法: __repr__ = __str__"""




