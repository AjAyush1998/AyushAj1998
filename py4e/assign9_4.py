fname =open("mbox-short.txt")
di=dict()
for line in fname:
    if line.startswith("From "):
        b=line.split(" ")
        di[b[1]]=di.get(b[1],0)+1
bn=None
bv=None
for key,val in di.items():
    if bv is None: bv=di[key]
    if bv<val:
        bv=val
        bn=key
print(bn,bv)
