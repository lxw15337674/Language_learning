#file read and write
f = open('D:/test.txt','r')  #如果不存在，会抛出一个IOerror错误
print(f.read())#read()会将内容读到内存，用str对象表示
f.close()#文件使用完毕后必须调用close()关闭文件，因为文件对象会占用系统的资源。
"""因为文件读写时都有可能产生IOerror，一旦出错，后面的close()就不会调用。
所以最好使用try...finally来实现"""
try:
    f = open('D:/test.txt', 'r')
    print(f.read())
finally:
    if f:
        f.close
"""python引入with语句更方便自动调用close()方法"""
with open('D:/test.txt', 'r') as f:
    print(f.read())
"""这和前面的try...fianlly相同,并且不必调用f.close()方法"""

"""调用read()会一次性读取文件的全部内容,如果文件过大,内存就无法承受,所以,保险起见,可以反复调用read(size)方法,每次最多读取size个字节
的内容,另外，调用readline()可以每次读取一行内容，调用readlines()一次读取所有内容并按行返回list。因此，要根据需要决定怎么调用。"""
with open('D:/test.txt', 'r') as f:
    for line in f.readlines():
        print(line.strip()) # strip()是把末尾的'\n'删掉
#file-like Object
"""像open()函数返回的这种有个read()方法的对象，在Python中统称为file-like Object。除了file外，还可以是内存的字节流，网络流，自定义
流等等。file-like Object不要求从特定类继承，只要写个read()方法就行。
StringIO就是在内存中创建的file-like Object，常用作临时缓冲。"""
##读取二进制文件
"""读取二进制文件，比如图片、视频等等，用'rb'模式打开文件即可："""
f = open('D:/test.jpg', 'rb')
##字符编码
"""要读取非UTF-8编码的文本文件，需要给open()函数传入encoding参数，例如，读取GBK编码的文件"""
f = open('D:/test.txt', 'r', encoding='gbk')
"""遇到有些编码不规范的文件，你可能会遇到UnicodeDecodeError，因为在文本文件中可能夹杂了一些非法编码的字符。遇到这种情况，open()函数
还接收一个errors参数，表示如果遇到编码错误后如何处理。最简单的方式是直接忽略："""
##写文件
"""写文件与读文件的唯一区别是调调用open()函数时，传入标识符'w'或者'wb'表示写文本文件或写二进制文件："""
f = open('D:/test.txt', 'w')
f.write('Hello, world!')
f.close()