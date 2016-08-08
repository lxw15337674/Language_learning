# 希尔排序
list = [9, 5, 3, 8, 6, 2, 0, 10, 4, 1, 8, 7]


def sort():
    b = int(len(list) / 2)
    while b>0:
        for a in range(b):
            for c in range(int((len(list)-a)/b)):
                try:
                    if list[a + c*b] <= list[a] <= list[a+(c+1)*b]:
                        list[a], list[a + c*b] = list[a + c*b], list[a]
                except:
                    list[a], list[a + c * b] = list[a + c * b], list[a]
                    print('error:',b, a, c, list)
                print(a,c,b,list)
        b = int(b / 2)


if __name__ == '__main__':
    sort()
