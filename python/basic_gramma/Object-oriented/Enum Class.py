#枚举类（Enum Class）
"""当我们需要定义常量时，一个办法就是用大写变量通过整数来定义：例如月份：
JAN = 1
FEB = 2
MAR = 3
...
NOV = 11
DEC = 12
缺点是类型为int，并且仍然是常量。
更好的方法是为这样的枚举类定义一个class类型，每个常量是class的一个唯一实例。"""
#Enum类来实现
from enum import Enum
Month = Enum('Month',('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'))
"""可以直接使用Month.Jan来引用一个常量，或者枚举他的所有成员"""
for name, member in Month.__members__.items():
       print(name,':',member,',',member.value)
       #value属性时自动赋给给成员的int常量，默认从1开始计数

#也可以从Enum派生出自定义类：
from enum import Enum,unique
@unique
class Weekday(Enum):
    Sun = 0 # Sun的value被设定为0
    Mon = 1
    Tue = 2
    Wed = 3
    Thu = 4
    Fri = 5
    Sat = 6
"""unique装饰器可以保证没有重复值"""
#访问枚举类型有多个方法：
#第一种
day1 = Weekday.Mon
print(day1)
#第二种
print(Weekday.Tue)
#第三种
print(Weekday['Tue'])
#第四种
print(Weekday.Tue.value)
#第五种
print(day1 == Weekday.Mon)
#第六种
print(Weekday(1))
#第七种
for name, member in Weekday.__members__.items():
       print(name, '：', member)
