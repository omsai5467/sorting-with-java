class node:
    def __init__(self,val):
        self.val = val
        self.next = None



class linkedList():
    def __init__(self):
        self.head = None
    def make(self,val):
        if self.head == None:
            self.head = node(val)
        else:
            h = self.head
            while h :
                if h.next == None:
                    h.next = node(val)
                    break
                h  = h.next
    def compare(self,other):
        h = self.head
        th = other.head
        while h and th :
            if h.val == th.val:
                h = h.next
                th = th.next
            else:
                return 0
        if h  == None and th == None:
            return 1
        else:
            return 0


if __name__ == "__main__":
    l1  = linkedList()
    l2 = linkedList()
    size = input().split(" ")
    s1 = int(size[0])
    s2 = int(size[1])
    for i in range(max(s1, s2)):
        x = input().split(" ")
        if len(x) == 2:
            l1.make(x[0])
            l2.make(x[1])
        else:
            if i < s1 :
                l1.make(x[0])
            else:
                l2.make(x[0])

    print(l1.compare(l2))
