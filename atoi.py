max_int = 2 ** 31 -1
min_int = -2 ** 31
neg = 1
res = 0
s = "   -42"
i = 0
s = s.strip()
# while i < len(s) and s[i] == " ":
#     i = i + 1
if i < len(s) and s[i] == "-":
    neg = -1
    i = i + 1
elif i < len(s) and s[i]== "+":
    i = i + 1
    neg = 1
# temp = ""
# print(temp)
while i < len(s) and s[i].isdigit():
    res = res * 10 + int(s[i])
    i = i +1
# print(temp)
# temp = int(temp) * neg
res = res * neg
if res < 0:
    print( max(res,min_int))
else:
    print(max(res,min_int))
