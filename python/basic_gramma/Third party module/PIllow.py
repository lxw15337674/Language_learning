"""PIL：Python Imaging Library，已经是Python平台事实上的图像处理标准库了
由于PIL仅支持到Python 2.7，加上年久失修，于是一群志愿者在PIL的基础上创建了兼容的版本，名字叫Pillow，支持最新Python 3.x，又加入了许多新特性，因此，我们可以直接安装使用Pillow。
"""
from PIL import Image
# 打开一个jpg图像文件，注意是当前路径:
im = Image.open('D:/python/test.jpg')
# 获得图像尺寸:
w, h = im.size
print('Original image size: %sx%s' % (w, h))
# 缩放到50%:
im.thumbnail((w//2, h//2))
print('Resize image to: %sx%s' % (w//2, h//2))
# 把缩放后的图像用jpeg格式保存:
im.save('D:/python/test1.jpg', 'jpeg')

#模糊效果也只需几行代码：
from PIL import Image, ImageFilter
# 打开一个jpg图像文件，注意是当前路径:
im = Image.open('D:/python/test.jpg')
# 应用模糊滤镜:
im2 = im.filter(ImageFilter.BLUR)
im2.save('D:/python/blur.jpg', 'jpeg')

"""小结:
PIL提供了操作图像的强大功能，可以通过简单的代码完成复杂的图像处理。"""