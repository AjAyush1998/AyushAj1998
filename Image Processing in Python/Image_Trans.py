from PIL import Image

img = Image.open('side.jpg')
img1 = Image.open('front.jpg')
flip_img1 = img.transpose(Image.FLIP_LEFT_RIGHT)
flip_img2 = img.transpose(Image.FLIP_TOP_BOTTOM)
rot90_img = img.transpose(Image.ROTATE_90)
rot180_img = img.transpose(Image.ROTATE_180)
rot270_img = img.transpose(Image.ROTATE_270)

flip_img1.show()
flip_img2.show()

rot90_img.show()
rot180_img.show()
rot270_img.show()