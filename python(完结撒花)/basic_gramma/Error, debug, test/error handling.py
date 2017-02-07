#error handling（错误处理）
"""在程序运行的过程中，如果发生错误，会返回一个错误代码。在操作系统提供的调用中
返回错误码非常常见，比如打开文件的函数open(),成功时返回文件描述符，出错时返-1

用错误码来表示是否出错时不便，因为函数本身应该返回的正常结果和错误码混在一起，造成
调用者必须用代码来判断是否出错：
def foo():
       r = some_function()
       if r==(-1):
              return(-1)
       # do something
       return r
def bar():
       r = foo()
       if r==(-1):
              print('error')
       else:
              pass
"""
"""一旦出错，还要一级一级上报，知道某个函数可以处理该错误。
所以高级语言通常都内置了一套try...except...finally...的错误处理机制"""
#try
##try的机制：
try:
       print('try...')
       r = 10/0
       print('result:',r)
except ZeroDivisionError as e:
       print('except:',e)
finally:
       print('finally...')
print('END')
"""用try来运行代码，如果执行出错，则后续代码不会继续执行，会跳转到except语句块，
执行完except后，如果有finally语句块，者执行finally语句块

如果把除数0改成2，
由于没有错误发生，所以expect语句块不会被执行但是finally如果有，则一定会被执行

如果有不同类型的错误，应该由不同的expect语句块处理"""
#可以有多个expect捕获不同类型的错误
try:
       print('try...')
       r = 10/int('a')
       print('result:',r)
except ValueError as e:
       print('ValueError:', e)
except ZeroDivisionError as e:
       print('ZeroDivisionError:',e)
finally:
       print('finally...')
print('end')

"""如果没有错误发生，可以在except语句块后面一个else，当错误没有发生时，会自动执行
else语句："""
try:
    print('try...')
    r = 10 / int('2')
    print('result:', r)
except ValueError as e:
    print('ValueError:', e)
except ZeroDivisionError as e:
    print('ZeroDivisionError:', e)
else:
    print('no error!')
finally:
    print('finally...')
print('END')
"""使用try...except捕获错误还有一个巨大的好处，就是可以跨越多层调用，
比如函数main()调用foo()，foo()调用bar()，结果bar()出错了，这时，
只要main()捕获到了，就可以处理："""

def foo(s):
    return 10 / int(s)

def bar(s):
    return foo(s) * 2

def main():
    try:
        bar('0')
    except Exception as e:
        print('Error:', e)
    finally:
        print('finally...')
"""也就是说，不需要在每个可能出错的地方去捕获错误，只要在合适的层次去捕获错误就
可以了。"""

#调用堆栈
"""如果错误没有被捕获，他就会一致往上抛，最后被py解释器捕获，打印一个错误信息、"""
#err.py
def foo(s):
       return 10/int(s)
def bar(s):
       return foo(s)*2
def main():
       bar('0')
main()
"""执行，结果如下：
$ python3 err.py
Traceback (most recent call last):
  File "err.py", line 11, in <module>
    main()
  File "err.py", line 9, in main
    bar('0')
  File "err.py", line 6, in bar
    return foo(s) * 2
  File "err.py", line 3, in foo
    return 10 / int(s)
ZeroDivisionError: division by zero"""

#记录错误
#py内置的logging模块可以记录错误信息：
import logging
def foo(s):
       return 10/int(s)
def bar(s):
       return foo(s)*2
def main():
       try:
              bar('0')
       except Exception as e:
              logging.exceptin(e)
main()
print('END')
"""同样是出错，但程序打印完错误信息后会继续执行，并正常退出：
$ python3 err_logging.py
ERROR:root:division by zero
Traceback (most recent call last):
  File "err_logging.py", line 13, in main
    bar('0')
  File "err_logging.py", line 9, in bar
    return foo(s) * 2
  File "err_logging.py", line 6, in foo
    return 10 / int(s)
ZeroDivisionError: division by zero
END

通过配置，logging还可以把错误记录到日志文件里。"""

#抛出错误
"""因为错误是class，捕获一个错误就是捕获到该class的一个实例，因此，错误是有意
创建并抛出的。自己编写的好书也可以抛出错误
如果要抛出错误，首先根据需要，可以定义一个错误的class，选择好继承关系，然后用
raise语句抛出一个错误的实例"""

class FooError(ValueError):
    pass

def foo(s):
    n = int(s)
    if n==0:
        raise FooError('invalid value: %s' % s)
    return 10 / n

foo('0')
"""执行，可以最后跟踪到我们自己定义的错误：

$ python3 err_raise.py 
Traceback (most recent call last):
  File "err_throw.py", line 11, in <module>
    foo('0')
  File "err_throw.py", line 8, in foo
    raise FooError('invalid value: %s' % s)
__main__.FooError: invalid value: 0
只有在必要的时候才定义我们自己的错误类型。如果可以选择Python已有的内置的错误类型（比如ValueError，TypeError），尽量使用Python内置的错误类型。
"""
#还有另一种错误处理的方式:

def foo(s):
    n = int(s)
    if n==0:
        raise ValueError('invalid value: %s' % s)
    return 10 / n

def bar():
    try:
        foo('0')
    except ValueError as e:
        print('ValueError!')
        raise

bar()
"""
在bar()函数中，我们明明已经捕获了错误，但是，打印一个ValueError!后，又把错误通过
raise语句抛出去了，这不有病么？
其实这种错误处理方式不但没病，而且相当常见。捕获错误目的只是记录一下，便于后续追
踪。但是，由于当前函数不知道应该怎么处理该错误，所以，最恰当的方式是继续往上抛，
让顶层调用者去处理。好比一个员工处理不了一个问题时，就把问题抛给他的老板，如果他
的老板也处理不了，就一直往上抛，最终会抛给CEO去处理。

raise语句如果不带参数，就会把当前错误原样抛出。此外，在except中raise一个Error，
还可以把一种类型的错误转化成另一种类型："""
try:
    10 / 0
except ZeroDivisionError:
    raise ValueError('input error!')
"""只要是合理的转换逻辑就可以，但是，决不应该把一个IOError转换成毫不相干的ValueError。"""
