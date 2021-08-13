fh=open("romeo.txt")
ls=fh.read()
la=ls.split()
x=list()
for l in la:
    if not l in x:
        x.append(l)
print(x)
x.sort()
print(x)
