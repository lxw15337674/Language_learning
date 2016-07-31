import re


def read_file():
    with open('text.txt', 'r') as f:
        return f.read()

def count(str):
    words = re.compile('[a-zA-Z0-9]+')
    dict = {}
    for x in words.findall(str):
        if x not in dict:
            dict[x] = 1
        else:
            dict[x] += 1
    print(dict)



if __name__ =="__main__":
    str = read_file()
    count(str)