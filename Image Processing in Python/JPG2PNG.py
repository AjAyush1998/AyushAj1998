from PIL import Image

img = Image.open('front.jpg')
img.save('NEW.png')

img2 = Image.open('NEW.png')
img2.save('NEW2.jpg')

# change mode (RGBA/PNG)
# new_img = img.convert("RGB")
# new_img.save("___.jpg")
