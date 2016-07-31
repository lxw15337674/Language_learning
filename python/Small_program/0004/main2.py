import re


def read_file():
    with open('text.txt', 'r') as f:
        return f.read()

def count(str):
    words_list = re.findall(r'[a-zA-Z0-9]+', str)
    print(words_list)
    print(len(words_list))

if __name__ =="__main__":
    str = read_file()
    count(str)