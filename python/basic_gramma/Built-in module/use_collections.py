"""collections是Python内建的一个集合模块，提供了许多有用的集合类。"""
#nametuple
from collections import namedtuple
Point = namedtuple('Point',['x','y']) #定义一个坐标
p = Point(1,2)
print(p.x,p.y)
"""namedtuple用来穿件一个自定义的tuple对象,并规定tuple元素个数,并用属性而不是索引来引用元素"""
Circle = namedtuple('Circle',['x','y','r'])
c = Circle(1,2,3)
print(c)

#deque
from collections import deque
q = deque(['a', 'b', 'c'])
q.append('x')
q.appendleft('y')
print(q)
"""deque是为了高效实现插入和删除操作的双向列表，适合用于队列和栈,
deque除了实现list的append()和pop()外，还支持appendleft()和popleft()，这样就可以非常高效地往头部添加或删除元素。"""

#defaultdict
from collections import defaultdict
dd = defaultdict(lambda: 'N/A')
dd['key1'] = 'abc'
print(dd['key1']) # key1存在
print(dd['key2']) # key2不存在
"""用dict时，如果引用的Key不存在，就会抛出KeyError。如果希望key不存在时，返回一个默认值，就可以用defaultdict"""

#OrderedDict
from collections import OrderedDict
d = dict([('a', 1), ('b', 2), ('c', 3)])
print(d) # dict的Key是无序的
od = OrderedDict([('a', 5), ('b', 2), ('c', 3)])
print(od) # OrderedDict的Key是有序的
print(list(od.keys()))#按照插入的key的顺序返回
"""OrderedDict可以实现FIFO（先进先出）的dict，当容量超出限制时，先删除最早添加的Key."""

#Counter
from collections import Counter
c = Counter()
for ch in 'programming':
       c[ch] = c[ch] + 1
print(c)
"""Counter是一个简单的计数器，例如，统计字符出现的个数：
Counter实际上也是dict的一个子类"""
