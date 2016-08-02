def judgement(input):
    flag = False
    with open('test.txt', 'r') as f:
        for line in f.read().split('\n'):
            if line in input:
               flag = True
               break
    if flag:
        print('包含敏感词汇')
    else:
        print('不包含敏感词汇')



if __name__ == "__main__":
    while True:
        a = input('please enter something\n')
        if a =='0':
            break
        judgement(a)
