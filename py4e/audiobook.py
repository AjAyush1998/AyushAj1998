import pyttsx3 as p
import PyPDF2 as pdf
book=open('pythonlearn.pdf','rb')
reader=pdf.PdfFileReader(book)
page=reader.numPages
print(page)
s=p.init()
pg=reader.getPage(12)
text=page.extractText()
s.say(text)
s.runAndWait()
