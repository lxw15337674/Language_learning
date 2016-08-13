# 第 0002 题：将 0001 题生成的 200 个激活码（或者优惠券）保存到 MySQL 关系型数据库中。
import pymysql
from rancode import *


def connectmysql():
    return pymysql.connect(host="localhost", user='root', password='lxw123456')

def create_db(cursor):
    cursor.execute('create database if not exists db')


def create_table(dbconn, cursor):
    dbconn.select_db('db')
    cursor.execute('create table youhuijuan(id int,keyid varchar(20))')


def insert_value(cursor):
    for a in range(200):
        cursor.execute('insert into youhuijuan values(%s,%s)',(a,codelist[a]))


def process():
        dbconn = connectmysql()
        cursor = dbconn.cursor()
        create_db(cursor)  # 创建数据库
        print('created db')
        dbconn.select_db('db')
        create_table(dbconn, cursor)    # 创建表
        print('inserting...')
        insert_value(cursor)            #插入数据
        print('inserted')
        dbconn.commit()
        cursor.close()
        dbconn.close()


if __name__ == "__main__":
    codelist = create_codelist()
    process()

