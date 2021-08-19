from PIL import Image

img = Image.open('side.jpg')
img1 = Image.open('front.jpg')
res_img = img1.resize((200,500))

img1.show()
res_img.show()