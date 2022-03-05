


def smallest(start,end,arr):
    for i in range(start,end+2):
        if i  not in arr:
            if i >= 0:
                return i




if __name__ == "__main__":
    # l = [1,2,3,4,5,6,7,8]
    l = input()
    l = input().split(" ")
    for i in range(len(l)):
        l[i] = int(l[i])
    start = min(l)
    end = max(l)
    print (smallest(start,end,l))
