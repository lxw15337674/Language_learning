import hashlib
db = {}
def hashPwd(user,pwd):
    md5 = hashlib.md5()
    md5.update((pwd+user+'the-salt').encode('utf-8'))
    return md5.hexdigest()

def creatUser(user, pwd):
    db[user] = hashPwd(user,pwd)
    return

def login(user,pwd):
    if db.get(user,False):
        if hashPwd(user,pwd) == db[user]:
            print('登陆成功')
        else:
            print('密码不正确')
    else :
        print('账户不存在')

if __name__ == '__main__':
    creatUser('lixiwang','123456')
    print(db)
    login('lixiwang','123445')
    login('lixiwang', '123456')
    login('asdas','asdasd')