#单元测试(unit test)
"""单元测试是用来对一个模块、一个函数或者一个类来进行正确性检验的测试工作。
比如对函数abs()，我们可以编写出以下几个测试用例：
  1.输入正数，比如1、1.2、0.99，期待返回值与输入相同；
  2.输入负数，比如-1、-1.2、-0.99，期待返回值与输入相反；
  3.输入0，期待返回0；
  4.输入非数值类型，比如None、[]、{}，期待抛出TypeError。
把上面的测试用例放到一个测试模块里，就是一个完整的单元测试。
单元测试的意义：如果我们对abs()函数代码做了修改，只需要再跑一遍单元测试，
  如果通过，说明我们的修改不会对abs()函数原有的行为造成影响，
  如果测试不通过，说明我们的修改与原有行为不一致，要么修改代码，要么修改测试。
#编写一个Dict类，这个类的行为和dict一致，但是可以通过属性来访问，用起来就像：
>>> d = Dict(a=1, b=2)
>>> d['a']
1
>>> d.a
1
"""
#mydict.py代码如下：
class Dict(dict):

    def __init__(self, **kw):
        super().__init__(**kw)

    def __getattr__(self, key):
        try:
            return self[key]
        except KeyError:
            raise AttributeError(r"'Dict' object has no attribute '%s'" % key)

    def __setattr__(self, key, value):
        self[key] = value
#为了编写单元测试，我们需要引入Python自带的unittest模块，编写mydict_test.py
import unittest      #unittest 测试模块
from mydict import Dict    #从mydict.py模板中导入Dict类
class TestDict(unittest.TestCase): #(unittest封测的标准类)
    def test_init(self):   #先测验Dict()中key-valve是否匹配！！！
        d=Dict(a=1,b='test')       #检验valve为int，str数据类型的情况
        self.assertEqual(d.a,1)
        self.assertEqual(d.b,'test')
        self.assertTrue(isinstance(d,dict))  #检验Dict()是否是dict类型

    def test_key(self):        #检测d['key']与d.key是否等价!!!   
        d=Dict()
        d['key']='value'
        self.assertEqual(d.key,'value')

    def test_attr(self):            #检验属性赋值法是否有效
        d=Dict()
        d.key='value'
        self.assertTrue('key' in d)
        self.assertEqual(d['key'],'value')

    def test_keyerror(self):        #抛出key法输入未存在key的错误
        d=Dict()
        with self.assertRaises(KeyError):
            value=d['empty']

    def test_attrerror(self):        #抛出属性赋值法输入未存在key的错误
        d=Dict()
        with self.assertRaises(AttributeError):
            value=d.empty

