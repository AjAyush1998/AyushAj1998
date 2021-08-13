def fun(x):
    if x>0:
        fun(--x)
        print(x,"")
        fun(--x)

a=4
fun(a)
