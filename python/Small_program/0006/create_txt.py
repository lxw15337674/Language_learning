# 创建一个文件夹并在其生成多个文本
import random, os

txtnum = 50  # 生成文本个数
Number = 500  # 生成字母个数


def create_ran():
    b = ''
    for i in range(Number):
        a = random.randint(97, 122)
        c = chr(a)
        b += c
        if len(b) % 3 == 0:
            b += ' '
    return b


def write_file(path, output):
    with open(('diary-%sday.txt' % path), 'w') as f:
        f.write(output)


def create_Folder():
    os.mkdir('diary')  # 创建文件夹
    os.chdir('diary')  # 切换到diary文件夹


if __name__ == "__main__":
    create_Folder()  # 生成文件夹
    for a in range(txtnum):  # 生成多个文本
        output = create_ran()
        write_file(a, output)
