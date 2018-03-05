def fname(x,y):
    if y==0:
        return 0
    return x + fname(x,y-1)
    pass


print(fname(1222,3))
