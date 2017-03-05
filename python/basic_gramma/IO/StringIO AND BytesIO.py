#StringIO和BytesIO
#StringIO
"""数据读写不一定是文件，也可以在内存中读写
StringIO顾名思义就是在内存中读写str"""
from io import StringIO
f = StringIO()
f.write('hello')
f.write(',lixiwang\n ')
print(f.getvalue())#getvalue()方法用于获得写入后的str。
f = StringIO('Hello!\nHi!\nGoodbye!')
while True:
    s = f.readline()
    if s == '':
        break
    print(s.strip())
#BytesIO
"""如果要操作二进制数据，就需要使用BytesIO。"""
from io import  BytesIO
f = BytesIO()
f.write('李希望'.encode('utf-8'))
print(f.getvalue())
"""写入的不是str，而是经过UTF-8编码的bytes。"""
from io import StringIO
f = BytesIO(b'\xe4\xb8\xad\xe6\x96\x87')
print(f.read())