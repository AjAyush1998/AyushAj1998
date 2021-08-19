from PIL import Image

img = Image.open("front.jpg")
area = (500,500,2149,2751)
crop_img = img.crop(area)
img.show()
crop_img.show()