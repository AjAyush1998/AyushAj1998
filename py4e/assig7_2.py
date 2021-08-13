fh = open('mbox-short.txt')
x=0.0
m=0
a=""
for line in fh:
    if  line.startswith("X-DSPAM-Confidence:"):
        a=line[19:]
        x=x+float(a)
        m=m+1
print("Average spam confidence: ",(x/m))
