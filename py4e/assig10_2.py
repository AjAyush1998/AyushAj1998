fname = open("mbox-short.txt")
di=dict()
li=list()
for line in fname:
    if line.startswith("From") and line.endswith("2008\n"):
        b=line.split(" ")
        a=b[6]
        c=a[:2]
        di[c]=di.get(c,0)+1
a=sorted(di.items())
for k,v in a:
    print(k,v)
