from PyPDF2 import PdfFileMerger

pdf1 = input("Enter File name:")
pdf2 = input("Enter File name:")

pdf1 += ".pdf"
pdf2 += ".pdf"

pdfs = [pdf1, pdf2]

merge = PdfFileMerger()

for pdf in pdfs:
	merge.append(pdf)

merge.write('Final_File.pdf')
merge.close()