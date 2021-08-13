fname = open("mbox-short.txt")
c=list()
cnt=0
for line in fname:
    if line.startswith("From "):
        b=line.split(" ")
        print(b[1])
        cnt+=1
print("There were", cnt, "lines in the file with From as the first word")
