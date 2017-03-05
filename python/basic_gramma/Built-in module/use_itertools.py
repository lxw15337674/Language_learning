#itertools提供了用于操作迭代对象的函数。
#count()会无限加1
import  itertools
db = [] #用于储存数字
num = itertools.count(10,2)
for n in num:
    if n > 30:
        break
    db.append(n)
print(db)

#cycle()会把传入的序列无限重复
a=1 #循环次数用于停止循环
num = itertools.cycle('abc')
for c in num:
    print(c)
    a+=1
    if(a==10):
        break

#repeat()把一个元素重复,第二个参数限定重复次数
num = itertools.repeat('wer',4)
for n in num:
    print(n)

#takewhile()根据条件判断来截取出一个有限的序列：
num = itertools.count(1)
lol = itertools.takewhile(lambda x: x<=10,num)
print(list(lol))

#chain()可以把一组迭代对象串联起来，形成一个更大的迭代器
for n in itertools.chain('abc','123'):
    print(n)

#groupby()把迭代器中相邻的重复元素挑出来放在一起：
for key,group in itertools.groupby('AAABBBCCCAAA'):
    print(key,list(group))
"""如果要忽略大小写分组,就可以让元素'A'和'a'都返回相同的key:"""
for key,group in itertools.groupby('AaaBBbcCAAa',lambda c: c.upper()):
    print(key,list(group))
"""小结:
itertools模块提供的是处理迭代功能的函数,他们的返回值不是list,而已Iterator,只是用for循环迭代的时候才真正计算。"""