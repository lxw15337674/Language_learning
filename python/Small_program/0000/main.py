# 第 0000 题：将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
from PIL import Image, ImageDraw, ImageFont
import random


def image_add(path):
    num = str(random.randint(0, 99))
    im = Image.open(path)
    w, h = im.size
    fnt = ImageFont.truetype('simsun.ttc', 26)  # 加载一个TrueType或者OpenType字体文件，并且创建一个字体对象。
    draw = ImageDraw.Draw(im)
    draw.text((7 * w / 10, h / 10), text=num, font=fnt,
              fill=180)  # text(xy,message,font=None) 绘制文字message，文本区域左上角坐标为xy
    im.save('plus%s.jpg' % num, 'jpeg')
    print('save as plus%s.jpg' % num)


if __name__ == '__main__':
    image_add('lol.jpg')
