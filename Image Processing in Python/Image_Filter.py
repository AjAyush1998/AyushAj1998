from PIL import Image
from PIL import ImageFilter

img = Image.open('side.jpg')
img1 = Image.open('front.jpg')
img2 = Image.open('IMG.jpg')
blur = img2.filter(ImageFilter.BLUR)
blur.show()
sharp = img2.filter(ImageFilter.SHARPEN)
sharp.show()

edge = img2.filter(ImageFilter.FIND_EDGES)
edge.show()