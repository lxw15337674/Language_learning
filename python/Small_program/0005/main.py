from PIL import Image

iPhone5_WIDTH = 1136
iPhone5_HEIGHT = 640


def read_file(path):
    im = Image.open(path)
    w, h = im.size
    return im, w, h


def handle_photo(im, w, h):
    if width >= iPhone5_WIDTH or height >= iPhone5_HEIGHT:
        # im.thumbnail((iPhone5_WIDTH, iPhone5_HEIGHT)) # 第一种方法画质损耗大
        im.resize((w, h), Image.ANTIALIAS)  # 第二种方法 画质损耗小,ANTIALIAS抗锯齿
        return im
    else:
        print('Picture does not need to deal with')


def save_file(im):
    im.save('resized.jpg', 'jpeg')


if __name__ == "__main__":
    im, width, height = read_file('photo2.jpg')
    handle_photo(im, width, height)
    save_file(im)
