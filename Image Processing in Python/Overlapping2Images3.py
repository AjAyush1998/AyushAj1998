# Overlapping
from PIL import Image

img = Image.open("front.jpg")
img2 = Image.open("Dragon.jpg")
area = (0,0,702,575)
img.paste(img2,area)
img.show()