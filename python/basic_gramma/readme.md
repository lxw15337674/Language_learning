py的文件名一定不能与包名相同,例如hanshlib.py  需要改为use_hanshlib.py
127.0.0.1是一个特殊的IP地址，表示本机地址
decode的作用是将其他编码的字符串转换成unicode编码，如str1.decode('gb2312')，表示将gb2312编码的字符串str1转换成unicode编码。
encode的作用是将unicode编码转换成其他编码的字符串，如str2.encode('gb2312')，表示将unicode编码的字符串str2转换成gb2312编码。