# import random
#
# list = []
#
# def loop(a, b):
#     while int(a) <= int(b):
#         list.append(chr(int(a)))  # chr转换为ASCII值
#         a += 1
#
#
# def random_letters():
#     loop(48, 57)  # 1-9
#     loop(65, 90)  # 大写字母
#     ranlist.append(random.choice(list))
#
#
# def random_colors():
#     ranlist.extend((random.randint(32, 127), random.randint(32, 127), random.randint(32, 127)))
#
#
# def randomall():
#     global  ranlist
#     ranlist = []
#     random_letters()
#     random_colors()
#     print(ranlist)
# randomall()
# randomall()
# import random
#
# from PIL import Image, ImageDraw,ImageFont, ImageFilter
#
# width =240
# height = 60
#
# def random_colors():
#     return random.randint(32, 127), random.randint(32, 127), random.randint(32, 127)
# def make_picture():
#     image = Image.new('RGB', (width, height), (255, 255, 255)) #创建图片
#     font = ImageFont.truetype('arial.ttf', 40)      #创建字体
#     draw = ImageDraw.Draw(image)#创建绘画对象
#     background_color = random_colors()
#     print(background_color)
#     for x in range(width):
#         for y in range(height):
#             draw.point((x, y), fill=(25,86,55))  #逐像素填充颜色
#     for t in range(4):
#         draw.text((60+30*t, 10), text='0', font=font,
#               fill=random)
#     image.show()
# make_picture()
import random
import string
print(string.ascii_letters)


