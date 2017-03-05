###使用@property (财产)

'''绑定属性时，如果直接把属性暴露，会没发检查参数，导致可以把参数随便修改
s = Student()
s.score = 9999 '''

"""为了限制score的范围，可以通过一个set_score()方法来设置成绩，再通过一个
set_score()来获取成绩，这样在set_score()方法中，可以检查参数"""
class Student(object):

       def get_score(self):
              return self._score

       def set_score(self,value):
              if not isinstance(value,int):
                     raise ValueError('score must be an inreger!')
              if value<0 or value> 100 :
                     raise ValueError('score must between 0-100!')
              self._score = value
s = Student()
s.set_score(60)
print(s.get_score())
"s.set_score(9999)  #会报错：ValueError: score must between 0 ~ 100!"

"""上面调用方法略显复杂。
   可以通过装饰器（decorator）给函数动态添加功能，对于类的方法，装饰器一样
起作用。通过@property装饰器负责把一个方法编程属性的调用"""
class Student(object):

    @property
    def score(self):
        return self._score

    @score.setter
    def score(self, value):
        if not isinstance(value, int):
            raise ValueError('score must be an integer!')
        if value < 0 or value > 100:
            raise ValueError('score must between 0 ~ 100!')
        self._score = value
"""@propery的使用：把一个getter方法编程属性，只需要加上@property，此时，@property
本身有创建了另一个装饰器@score.setter,负责把一个setter方法编程属性赋值，于是，拥有
一个可控的属性操作"""
s = Student()
s.score = 60        #实际转化为s.set_score(60)
print(s.score)      #实际转换为sget_score()
"s.score = 9999  #会报错：ValueError: score must between 0 ~ 100!"
"""@property，我们在对实例属性操作的时候，就知道该属性很可能不是直接暴露的，而是
通过getter和setter方法来实现的。"""

"""还可以定义只读属性，即实现getter方法，不定义setter方法。"""
class Student(object):

       @property
       def birth(self):
              return self._birth

       @birth.setter
       def birth(self,value):
              self._birth = value

       @property
       def age(self):
              return 2015 - self._birth
"""上面的birth是可读写属性，而age是只读属性，因为age可以根据birth和当前时间计算
出来"""

