#__getitem__
"""Fib 实例虽然能作用于for循环，看起来和list有点像，但是，把它当做list来使用还是
不行，比如，取第5个元素：
fib()[5] #报错 TypeError: 'Fib' object does not support indexing"""
#要表现得像list那样按照下标取出元素，需要实现__getitem__()方法
class Fib(object):
       def __getitem__(self,n):
              a,b = 1,1
              for x in range(n):
                     a,b = b,a+b
              return a
f = Fib()
print(f[10])

#但是list有个切片方法:
print(list(range(100))[5:10])
"""对于Fib缺报错，因为切片对象为silce，普通传入的参数为int，所以要进行判断:"""
class Fib(object):
       def __getitem__(self,n):
              if isinstance(n,int): # n是索引
                     a,b = 1,1
                     for x in range(n):
                            a,b=b,a+b
                     return a
              if isinstance(n,slice): # n是切片
                     start = n.start
                     stop = n.stop
                     if start is None:
                            start = 0
                     a,b =1,1
                     L = []
                     for x in range(stop):
                            if x>= start:
                                   L.append(a)
                            a,b=b,a+b
                     return L
f = Fib()
print(f[0:5])
print(f[:10])
"""但是没有对step参数做处理：
>>>f[:10:2]
[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
也没有对负数作处理，所有，要正确实现一个__getitem__()还有很多工作要做的。"""
