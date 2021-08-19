from PIL import Image

img = Image.open("front.jpg")

r, g, b = img.split()
img.show()
r.show()
g.show()
b.show()