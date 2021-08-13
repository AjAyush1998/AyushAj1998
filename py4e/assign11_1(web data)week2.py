import re
h=open("regex_sum_1042217.txt")
su=list()
k=0
for i in h:
    a=i.rstrip()
    num=re.findall('\d+',a)
    if len(num)>0:
        for j in num:
            k=k+int(j)
print(k)
