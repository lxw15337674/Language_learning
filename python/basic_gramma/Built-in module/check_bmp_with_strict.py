import struct
def check(file_path):
       try:
              with open(file_path,'rb') as f :
                     text = f.read(30)
                     obj = struct.unpack('<ccIIIIIIHH', text)
              if obj[0] != b'B':
                     print('该文件并非位图文件')
              else:
                     if obj[1] ==b'M':
                            print('该图像为Windows位图\n图像大小: %s * %s 颜色数: %s' % (obj[6], obj[7], obj[9]) )
                     if obj[1] ==b'A':
                            print('该图像为OS/2位图\n图像大小: %s * %s 颜色数: %s' % (obj[6], obj[7], obj[9]) )
       except:
              print("文件路径不对,请重新输入")
while True:
       path = input('please enter filepath\n')
       a = 'D:/test.bmp'
       if path=='0':
              break
       check(path)
