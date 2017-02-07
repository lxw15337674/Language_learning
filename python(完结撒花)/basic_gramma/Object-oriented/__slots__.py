###使用__slots__(槽）

#创建class实例
class Student(object):
       pass
s = Student()
s.name = 'lixiwang'#给实例绑定一个属性
print(s.name)

def set_age(self,age):#定义一个函数作为函数作为实例方法
       self.age = age
from types import MethodType
s.set_age = MethodType(set_age,s) #给实例绑定一个方法
s.set_age(25) #调用实例方法
print("测试",s.age) #测试结果

#给一个实例绑定的方法，对另一个实例是不起作用的：
s2 =Student() #创建新的实例
#s2.set_age(25) 尝试调用方法，会报错


#为了给所有实例都绑定方法，可以给class绑定方法:
def set_score(self,score):
       self.score = score
Student.set_score = set_score

#给class绑定方法后，所有实例均可调用：
s.set_score(100)
print(s.score)
s2.set_score(99)
print(s2.score)
'''通常情况下，上面的set_score方法可以直接定义在class中，但动态绑定允许我们在程
序运行的过程中动态给class加上功能，这在静态语言中很难实要现。'''

"""如果要限制实例的属性，例如只允许对Student实例添加name和age属性。
为了达到限制的目的，python允许在定义class的时候，定义一个特殊的__slots__变量，来
限制该class实例能添加的属性"""
class Student(object):
       __slots__= ('name','age') #用tuple定义允许绑定的属性名称
s = Student() #创建新的实例
s.name =  'lixiwang' #绑定属性'name'
s.age = 25 # 绑定属性'age'
"""s.score = 99  # 绑定属性'score 会报错!!
#报错：AttributeError: 'Student' object has no attribute 'score' """

"""__slots__定义的属性进队当前类实例起作用，对继承的子类是不起作用，对继承的子类
是不起作用的"""
class Student2(Student):
       pass
g = Student2();
g.score = 999
print(g.score)
"""除非在子类中也定义__slots__，这样，子类实例允许定义的属性就是自身的__slots__
加上父类的__slots__。"""

