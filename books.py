# peak elements in
def peak(arr):
    arr.append(-1)
    if len(arr) >= 2:
        if arr[0] > arr[1]:
            return 0
    for i in range(1,len(arr) - 1):
        if arr[i] > arr[i - 1] and arr[i] > arr[i+1]:
            return i
    return -1


if __name__ == "__main__":
    # l = []
    size = int(input())
    l = input().split(" ")
    for i in range(size):
        l[i] = int(l[i])
    print(peak(l))
