
l = [2,3,4,9]
k = 6




def s(arr,i,k):
    temp = []
    for j in arr:
        val = j / i
        t = isInt(val)
        if t :
            temp.append(int(val))
        else:
            temp.append(int(val) + 1)

        # temp.append()
    if sum(temp) <=k:
        # print(temp)
        return True
    else:
        return False

def isInt(val):
    if val % 1 == 0:
        return True
    else :
        return False

for i in range(1,max(l)):
    x = s(l,i,k)
    if x:
        print(i)
        break
