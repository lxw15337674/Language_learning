def judgement(input):
    with open('test.txt', 'r') as f:
        for line in f.read().split('\n'):
            if line in input:
                input = input.replace(line, len(line) * '*')
    print(input)


if __name__ == "__main__":
    while True:
        a = input('please enter something\n')
        if a == '0':
            break
        judgement(a)
