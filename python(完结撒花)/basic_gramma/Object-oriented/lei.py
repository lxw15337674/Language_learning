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

#__iter__
"""如果一个类想被用于for ... in循环，类似list或tuple那样，就必须实现一个
__iter__()方法，该方法返回一个迭代对象，然后，Python的for循环就会不断调用该迭代
对象的__next__()方法拿到循环的下一个值，直到遇到StopIteration错误时退出循环。"""

#以斐波那契数列为例，写一个Fib类，可以作用于for循环：
class Fib(object):
       def __init__(self):
              self.a,self.b=0,1 #初始化两个计数器a，b
       def __iter__(self):
              return self # 实例本身就是迭代对象，故返回自己
       def __next__(self):
              self.a,self.b = self.b,self.a + self.b
              if self.a > 100000:
                     raise StopIteration();
              return self.a 
for n in Fib():
       print(n)

#__getitem__
'''Fib实例虽然能作用于for循环，看起来和list有点像，但是，把它当成list来使用还是
不行，比如，取第5个元素:>>> Fib()[5]
Traceback (most recent call last):
File "<stdin>", line 1, in <module>
TypeError: 'Fib' object does not support indexing'''
#要表现得像list那样按照下标取出元素，需要实现__getitem__()方法：
class Fib(object):
       def __getitem__(self,n):
              a,b = 1,1
              for x in range(n):
                     a,b = b,a+b
              return a
f =Fib()
print(f[10])
