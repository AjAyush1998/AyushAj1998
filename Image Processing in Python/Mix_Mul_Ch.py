from PIL import Image

img = Image.open('side.jpg')
img1 = Image.open('front.jpg')
area = (602,0,2751,2751)
crop_img = img.crop(area)
r1, g1, b1 = crop_img.split()
r2, g2, b2 = img1.split()
mix_image = Image.merge("RGB", (r2,g2,b1))
mix_image.show()