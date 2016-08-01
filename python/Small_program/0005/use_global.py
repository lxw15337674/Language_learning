from PIL import Image

iPhone5_WIDTH = 1136
iPhone5_HEIGHT = 640


def read_file(path):
    global im, w, h
    im = Image.open(path)
    w, h = im.size


def handle_photo():
    if w >= iPhone5_WIDTH or h >= iPhone5_HEIGHT:
        # im.thumbnail((iPhone5_WIDTH, iPhone5_HEIGHT)) # 第一种方法画质损耗大
        im.resize((w, h), Image.ANTIALIAS)  # 第二种方法 画质损耗小,ANTIALIAS抗锯齿
    else:
        print('Picture does not need to deal with')


def save_file():
    im.save('resized.jpg', 'jpeg')


if __name__ == "__main__":
    read_file('photo2.jpg')
    handle_photo()
    save_file()
