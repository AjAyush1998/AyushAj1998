from PIL import Image
import os

size = (200,200)
for f in os.listdir('.'):
	if f.endswith(('.jpg', '.png')):
		i = Image.open(f)
		fname, fext = os.path.splitext(f)

		i.thumbnail(size)
		i.save('Size/{}_cropped.{}'.format(fname, fext))