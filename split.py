#
#
#
#
# l = [5,5,5]
#
# def re(i,a,b,arr):
#     if i >= len(arr):
#         return a % 10 == 0 and b %2 == 1
#     else:
#         return re(i+1,a+arr[i],b,arr) or re(i+1,a,b+arr[i],arr)
#
#
#
# if re(0,0,0,l):
#     print("YES")
# else:
#     print("NO")

# def fib(n):
#     a = 0
#     b = 1
#     if n == 1:
#         pass
#         # print(a)
#     else:
#         # print(a)
#         # print(b)
#         for i in range(2,n):
#             c = a + b
#             a = b
#             b = c
#         print(c)
# fib(1)



# nice sub arrays question


def sub(start,end ,arr,count,oddnums):
    if end >len(arr):
        return count
    else:
        temp = arr[start:end]
        c = 0
        for i in temp:
            if i %2 == 1:
                c = c+ 1
        if c == oddnums:
            count = count + 1
            start = start + 1
            # end = end - 1
        return sub(start,end+1,arr,count,oddnums)

# 5 3 1 1 2 1 1
l = [2,4,6]


print(sub(0,1,l,0,1))
