"""Python没有专门处理字节的数据类型。str既是字符串，又可以表示字节.
Python提供了一个struct模块来解决bytes和其他二进制数据类型的转换。"""
#pack函数把任意数据类型变为bytes
import struct
print(struct.pack('>I',1024599))
"""pack的第一个参数是处理指令，'>I'的意思是：
>表示字节顺序是big-endian，也就是网络序，I表示4字节无符号整数。
后面的参数个数要和处理指令一致。"""

#unpack把bytes编程想赢的数据类型:
print(struct.unpack('>IH',b'\xf0\xf0\xf0\xf0\x80\x80'))
"""根据>IH的说明，后面的bytes依次变为I：4字节无符号整数和H：2字节无符号整数。"""
