###Multiple Inheritance（Mixln,多重继承）
"""Animal类层次的设计，假设我们要实现以下4种动物：
       Dog - 狗狗；
       Bat - 蝙蝠；
       Parrot - 鹦鹉；
       Ostrich - 鸵鸟。
需要按照 哺乳动物和鸟类 和 按照“能跑”和“能飞” 归类"""

"""采用多重继承，首先，主要的类层次按照哺乳动物和鸟类设计："""
class Animal(object):
       pass

# 大类：
class Mamal(Animal):
       pass
class Bird(Animal):
       pass

#动物:
class Dog(Mamal):
       pass
class Bat(Mammal):
    pass
class Parrot(Bird):
    pass
class Ostrich(Bird):
    pass

"""给动物加上Runnable和Flyable的功能"""
#定义Runnable和Flyable的类：
class Runnble(object):
       def run(self):
              print("Running....")
class Flyable(object):
       def fly(self):
              print("Flying....")
#动物继承，例如Dog：
class Dog(Mamal,Runnable):
       pass
"""
通过多重继承，一个子类就可以获取多个父类的所有功能
由于Python允许使用多重继承，因此，MixIn就是一种常见的设计。
只允许单一继承的语言（如Java）不能使用MixIn的设计。
"""
