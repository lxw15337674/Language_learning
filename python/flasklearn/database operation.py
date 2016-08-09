from use_database import db,Role,User

#删除数据库
# db.drop_all()
#创建数据库
db.create_all()

#插入行
##创建角色和用户
admin_role = Role(name='Admin')
mod_role = Role(name='Moderator')
user_role = Role(name='User')
user_john = User(username='john', role=admin_role)
user_susan = User(username='susan', role=user_role)
user_david = User(username='david', role=user_role)
##添加到事务中
db.session.add_all([admin_role, mod_role, user_role,
                    user_john, user_susan, user_david])
#写入数据库
db.session.commit()
# print(admin_role.id)

# #删除行
# db.session.delete(mod_role)
# db.session.commit()
#
# #查询行
# Role.query.all()
