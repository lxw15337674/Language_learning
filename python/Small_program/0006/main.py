import os, re


def read_txt(path):
    global str
    with open(path, 'r') as f:
        str = f.read()


def handle_text():
    words = re.compile('[a-zA-Z0-9]+')
    dict = {}
    for x in words.findall(str):
        if x not in dict:
            dict[x] = 1
        else:
            dict[x] += 1
    list = sorted(dict)  # 根据数值的大小正序排序为list,list中的0即为出现频率最多的单词
    num = dict[list[0]]  # 得到单词出现的频率
    return list[0], num


def output(path, keyword, num):
    print('在%s文本中,%s为关键词,共出现%s次' % (path, keyword, num))


def Statistics(path):
    read_txt(path)
    keyword, num = handle_text()
    output(path, keyword, num)


def loop():
    for a in list:
        Statistics(a)  # 统计单个文本


def check_txtnumber():
    os.chdir(r'diary')
    global list  # 作为全局变量
    list = os.listdir()  # 将文本名输入list


if __name__ == '__main__':
    check_txtnumber()  # 检测文件夹中文本个数
    loop()  # 循环统计
