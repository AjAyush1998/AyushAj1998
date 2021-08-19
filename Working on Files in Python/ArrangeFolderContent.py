import os
import shutil

current_directory = os.path.dirname("C:\\Users\\LENOVO\\Desktop\\")
print(current_directory)

for filename in os.listdir(current_directory):
	if filename.endswith(('.jpg', '.png', '.gif')):
		if not os.path.exists("Images"):
			os.makedirs('Images')
		shutil.copy(filename, 'Images')
		os.remove(filename)
		print("Images folder done!")

	if filename.endswith(('.pdf', '.docx')):
		if not os.path.exists("Documents"):
			os.makedirs('Documents')
		shutil.copy(filename, 'Documents')
		os.remove(filename)
		print("Documents folder done!")

	if filename.endswith(('.apk', '.exe')):
		if not os.path.exists("Apps"):
			os.makedirs('Apps')
		shutil.copy(filename, 'Apps')
		os.remove(filename)
		print("Apps folder done!")

	if filename.endswith(('.mp4', '.mkv', '.wmv')):
		if not os.path.exists("Videos"):
			os.mkdirs('Videos')
		shutil.copy(filename, 'Videos')
		os.remove(filename)
		print("Videos folder done!")

print("Task Completed!")
