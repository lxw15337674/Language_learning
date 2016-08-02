"""1.随机生成一个字母
2.随机生成一个颜色
3.设置图片尺寸
4.循环4次,将一个字母一种颜色渲染到图片上
6.模糊化"""
import random

from PIL import Image, ImageDraw, ImageFont,ImageFilter

list = []
width = 240
height = 60


def loop(a, b):
    while int(a) <= int(b):
        list.append(chr(int(a)))  # chr转换为ASCII值
        a += 1


def random_letters():
    loop(48, 57)  # 1-9
    loop(65, 90)  # 大写字母
    return random.choice(list)


def random_colors():
    return random.randint(32, 127), random.randint(32, 127), random.randint(32, 127)


def make_picture():
    image = Image.new('RGB', (width, height), (255, 255, 255))  # 创建图片
    font = ImageFont.truetype('arial.ttf', 40)  # 创建字体
    draw = ImageDraw.Draw(image)  # 创建绘画对象
    background_color = random_colors()  # 生成背景色
    # 逐像素填充背景颜色
    for x in range(width):
        for y in range(height):
            draw.point((x, y), fill=background_color)
    #填充文字
    for t in range(4):
        draw.text((30+50*t,10),random_letters(),font=font,fill = random_colors())
    image=image.filter(ImageFilter.BLUR)
    image.show()


if __name__ == "__main__":
    make_picture()
