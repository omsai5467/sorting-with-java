
k = 4

l = [1,2,3,4,5,6,7,8,9,10]
s= sum(l[0:k])
m= s
i = 0
while k < len(l):
	s = s - l[ k+i - k] + l[k]
	print("i",i,"k",k,"t",s)
	m = max(s,m)
	k = k + 1
	i += 1

print(m)

