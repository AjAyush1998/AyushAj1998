from PIL import Image
import os

for f in os.listdir('.'):
	if f.endswith('.jpg'):
		i = Image.open(f)
		fname, fext = os.path.splitext(f)
		i.save('Images/{}.png'.format(fname))

	if f.endswith('.png'):
		i = Image.open(f)
		new_img= i.convert("RGB")
		fname, fext = os.path.splitext(f)
		i.save('Images/{}.jpg'.format(fname))