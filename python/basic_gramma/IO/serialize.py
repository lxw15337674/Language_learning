#serialize (序列化)
"""变量从内存中变成可存储或传输的过程称之为序列化
序列化之后，就可以把序列化后的内容写入磁盘，或者通过网络传输到别的机器上。
反过来，把变量内容从序列化的对象重新读到内存里称之为反序列化，即unpickling。
Python提供了pickle模块来实现序列化。"""
import pickle
d = dict(name='bob',age=20,score=88)
print(pickle.dumps(d))
"""pickle.dumps()方法方法把任意对象序列化成一个bytes，然后，就可以把这个bytes写入文件。
或者用另一个方法pickle.dump()直接把对象序列化后写入一个file-like Object："""
f = open('D:\dump.txt','wb')#wb write bytes
pickle.dump(d,f)
f.close()

"""当我们要把对象从磁盘读到内存时，可以先把内容读到一个bytes，然后用pickle.loads()方法反序列化出对象，
也可以直接用pickle.load()方法从一个file-like Object中直接反序列化出对象。
我们打开另一个Python命令行来反序列化刚才保存的对象："""
f = open('D:\pickle.txt','rb')#rb read bytes
d = pickle.load(f)
f.close()
print(d)
"""变量的内容又回来了,
Pickle的问题和所有其他编程语言特有的序列化问题一样，就是它只能用于Python，
并且可能不同版本的Python彼此都不兼容，因此，只能用Pickle保存那些不重要的数据，不能成功地反序列化也没关系。"""



















