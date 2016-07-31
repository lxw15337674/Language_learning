import re

def read_file():
    with open('file.txt', 'r') as f:
        return f.read()

def count(str):
    dict = {}
    words = re.findall(r'[a-zA-Z0-9]',str)
    for x in words:
        if x not in dict:
            dict[x] = 1
        else:
            dict[x] +=1
    print(dict)


if __name__ =="__main__":
    str = read_file()
    count(str)