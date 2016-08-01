# 统计每个py文件代码行数
import os

path_list = []


def traversal():  # 遍历出文件夹中所有py文件,并输入为list
    for root, dirs, files in os.walk('test'):  # 遍历,root为目录名,dirs为目录中的文件夹名,files为目录中的文件名.保存为list
        for f in files:  # 循环每个文件
            if f.endswith('.py'):  # 判断文件是否为.py,即为py类型文件
                path = os.path.join(root, f)  # 路径为目录名+文件名
                path_list.append(path)  # 路径添加到list


def statistics(path):
    note_num = 0
    empty_num = 0
    code_num = 0
    with open(path, 'r', encoding='utf-8') as f:
        for line in f.read().split('\n'):  # 通过\n分隔然后进行逐行循环判断
            code_num += 1
            if line == '':  # 判断是否为空行
                empty_num += 1
            if '#' in line:  # 判断是否为注释行
                note_num += 1
    print("在%s中，共有%s行代码，其中有%s空行，有%s处注释" % (path, code_num, empty_num, note_num))


def loop_statistics():
    for path in path_list:
        statistics(path)


if __name__ == "__main__":
    traversal()  # 遍历
    loop_statistics()  # 统计
