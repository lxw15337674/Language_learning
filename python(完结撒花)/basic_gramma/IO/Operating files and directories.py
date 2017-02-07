#Operating files and directories(操作文件和目录)
"""Python内置的os模块也可以直接调用操作系统提供的接口函数"""
import  os
os.name#操作系统类型
"""如果是posix，说明系统是Linux、Unix或Mac OS X，如果是nt，就是Windows系统。"""
#print(os.uname())#uname()函数在Windows上不提供
#环境变量
os.environ  #获取操作系统中定义的环境变量
os.environ.get('PATH') #获取PATH环境变量的值
#操作文件和目录
"""操作文件和目录的函数一部分放在os模块中，一部分放在os.path模块中"""
# 查看当前目录的绝对路径:
os.path.abspath('.')
# 在某个目录下创建一个新目录，首先把新目录的完整路径表示出来:
os.path.join('/Users/michael', 'testdir')
# 然后创建一个目录:
os.mkdir('/Users/michael/testdir')
# 删掉一个目录:
os.rmdir('/Users/michael/testdir')
'把两个路径合成一个时，不要直接拼字符串，而要通过os.path.join()函数'
#拆分路径通过os.path.split()函数
os.path.split('D:/test.txt')

