from PIL import Image

ascii_char = list("123456789kbdpqwmZO0QLCJUYXzcvunxrjft/\|()1{}[]?-_+~<>i!lI;:,\"^`'. ")


# RGB值转字符的函数：
def get_char(r, b, g):
    if int(r) == 255 and int(b) == 255 and int(g) ==255:
        return " "
    length = len(ascii_char)
    gray = int(0.2126 * r + 0.7152 * g + 0.0722 * b)
    unit = (256.0 + 1) / length
    return ascii_char[int(gray / unit)]

if __name__ == '__main__':
    im = Image.open('test.jpg')
    im = im.resize((80,80))
    height,width = im.size
    txt = ""
    for i in range(height):
        for j in range(width):
            txt += get_char(*im.getpixel((j,i)))
        txt += '\n'
    print(txt)
    # 字符画输出到文件
    with open("output.txt", 'w') as f:
        f.write(txt)