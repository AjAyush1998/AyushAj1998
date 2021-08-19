from PIL import Image

img = Image.open("front.jpg")
r, g, b = img.split()
img1 = Image.merge("RGB", (r, g, b))
img1.show()
img2 = Image.merge("RGB", (g, b, r))
img2.show()
img3 = Image.merge("RGB", (r, b, g))
img3.show()