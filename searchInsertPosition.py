
size  = int(input())
array = input().split(" ")
array.append(array[0])

for i in range(len(array)):
  array[i] = int(array[i])



for i in range(len(array)-1):
    if array[i] >= array[i+1]:
        print(array[i+1] , end = " ")
    else:
        print(-1,end = " ")
