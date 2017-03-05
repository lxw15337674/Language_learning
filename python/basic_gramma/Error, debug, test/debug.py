##debug(调试)

#print()
"""即直接打出可能出现问题的变量"""

#断言(assert)
def foo(s):
    n = int(s)
    assert n != 0, 'n is zero!'
    return 10 / n

def main():
    foo('0')
"""assert的意思是，表达式n != 0应该是True，否则，根据程序运行的逻辑，后面的代码
肯定会出错。
如果断言失败，assert语句本身就会抛出AssertionError：
$ python3 err.py
Traceback (most recent call last):
  ...
AssertionError: n is zero!
启动Python解释器时可以用-O参数来关闭assert：
$ python3 -O err.py
Traceback (most recent call last):
  ...
ZeroDivisionError: division by zero
关闭后，你可以把所有的assert语句当成pass来看。"""

#logging
"""把print()替换为logging,和assert比，logging不会抛出错误，而且可以输出到文件:"""
import logging
logging.basicConfig(level=logging.INFO)

s = '0'
n = int(s)
logging.info('n = %d' % n)
print(10 / n)
"""看到输出了：
$ python3 err.py
INFO:root:n = 0
Traceback (most recent call last):
  File "err.py", line 8, in <module>
    print(10 / n)
ZeroDivisionError: division by zero

这就是logging的好处，它允许你指定记录信息的级别，有debug，info，warning，error
等几个级别，当我们指定level=INFO时，logging.debug就不起作用了。同理，指定
level=WARNING后，debug和info就不起作用了。这样一来，你可以放心地输出不同级别的
信息，也不用删除，最后统一控制输出哪个级别的信息。

logging的另一个好处是通过简单的配置，一条语句可以同时输出到不同的地方，
比如console和文件。"""

##pdb
"""让程序以单步方式运行，可以随时查看运行状态。"""
##pdb.set_trace()
"""这个方法也是用pdb，但是不需要单步执行，我们只需要import pdb，然后，在
可能出错的地方放一个pdb.set_trace()，就可以设置一个断点"""
