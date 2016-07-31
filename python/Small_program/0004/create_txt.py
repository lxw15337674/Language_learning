#创建一个英文的纯文本文件
import random

Number = 500  # 生成字母个数


def create_ran():
    b=''
    for i in range(Number):
        a = random.randint(97, 122)
        c = chr(a)
        b+=c+' '
    return b


def write_file(output):
    with open('file.txt','w') as f:
        f.write(output)


if __name__ =="__main__":
    output = create_ran()
    write_file(output)
