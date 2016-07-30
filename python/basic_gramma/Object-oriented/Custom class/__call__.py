#__call__
"""一个对象实例也可以有自己的属性和方法，当我们调用实例方法时，我们用
instance.method()来调用。"""
#任何类，只需要定义一个__call__()方法，就可以直接对实例进行调用
class Student(object):
       def __init__(self,name):
              self.name = name
       def __call__(self):
              print('my name is %s' %self.name)
#调用方法
s=Student("lixiwang")
s() #self参数不要传入

"""__call__()也可以定义函数，
判断一个对象是否能被调用，能被调用的对象就是一个Callable对象"""
print(callable(max))
print(callable('str'))
    
