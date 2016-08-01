import re


def count_the_words(path):
    with open(path) as f:
        text = f.read()
        words_list = re.findall(r'[a-zA-Z0-9]+', text)
        count = len(words_list)
    return count


if __name__ == '__main__':
    nums = count_the_words('text.txt')
    print(nums)
