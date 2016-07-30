# 第 0001 题：做为 Apple Store App 独立开发者，你要搞限时促销，为你的应用生成激活码（或者优惠券），使用 Python 如何生成 200 个激活码（或者优惠券）？
"""生成8位由数字,小写字母和大写字母组成的优惠码"""
import random

list = []  # 作为随机序列
Length = 8  # 优惠码长度
Number = 200  # 优惠码个数


def loop(a, b):
    a = int(a)
    b = int(b)
    while a <= b:
        list.append(chr(a))  # chr转换为ASCII值
        a += 1


def ran():
    loop(48, 57)  # 1-9
    loop(65, 90)  # 大写字母
    loop(97, 122)  # 小写字母
    return random.choice(list)


def create_precod():
    precod = ''
    for a in range(Length):
        precod += ran()
    return precod

def create_codelist():
    codelist = []
    for a in range(Number):
        codelist.append(create_precod())
    return codelist
