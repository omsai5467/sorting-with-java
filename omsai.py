x = 120
re = 0
while x > 0:
	re = re + x % 10
	x = x // 10
print(re)
