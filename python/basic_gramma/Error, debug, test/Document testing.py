#Document testing(文档测试)
#doctest用例
def  fun(arg1):
     """
     >>> fun(1)
     1"""
     print(arg1)
if __name__ == '__main__':
    import doctest
    doctest.testmod()