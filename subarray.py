








def sub(start,end,arr,count,odd):
	if end > len(arr):
		return count
	temp = arr[start:end]
	c = 0
	for i in temp:
		if i % 2 == 1:
			c= c+ 1
	if c == odd :
		count =  count + 1
	return sub(start,end+1,arr,count,odd)


nums = [2,4,6]
k = 1
s = k
sum = 0
for i in range(len(nums)):
	x= sub(i,k,nums,0,s)
	sum = sum + x

print(sum)