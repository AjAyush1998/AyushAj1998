from PIL import Image

img = Image.open("front.jpg")
print(img.size)

print(img.format)
img.show()