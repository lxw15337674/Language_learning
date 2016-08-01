# coding:utf-8
# import os
#
# list = []
# for root, dirs, files in os.walk('test'):  # 遍历
#     for f in files:
#         if f.endswith('.py'):
#             path = os.path.join(root, f)
#             list.append(path)
#
# line_num = 0
# with open(path, 'r') as f:
#     for line in f.read().split('\n'):
#         line_num += 1
# print(line_num)

# def lol():
#     global a
#     a =[]
#     a.append('123')
#     print(a)
# lol()
# print(a)
import re

def a():
    with open('test/lol.py', 'r', encoding='utf-8') as f:
        global note_num
        note_num = 0
        global empty_num
        empty_num = 0
        global code_num
        code_num = 0
        for line in f.read().split('\n'):
            if line == '':
                empty_num += 1
            else:
                code_num += 1
                if '#' in line:
                    note_num += 1

a()
print(empty_num)
print(code_num)
print(note_num)




#
# a= '    #12345678'
# b=a.index('#')
# print(b)
# list = []
# def add():
#     list.append('add')
# def add2():
#     list.append('add2')
# add()
# print(list)
# add2()
# # print(list)
# num = 0
# def add(num=None):
#     num+=1
# add()
# print(num)
