class Student(object):
    def __init__(self, name):
        self.name = name


print(Student('lixiwang'))


# 为了让打印的好看，只需要定义__str__()方法，返回一个好看的字符串
class Student(object):
    def __init__(self, name):
        self.name = name

    def __str__(self):
        return 'Student object (name:%s)' % self.name


print(Student('lixiwang'))