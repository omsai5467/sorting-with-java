
class node:
    def __init__(self,val):
        self.val = val
        self.next = None

class linkedList():
    def __init__(self):
        self.head = None
        self.size = 0
    def make(self,val):
        if self.head == None:
            self.head = node(val)
            self.size += 1
        else:
            h = self.head
            while h :
                if h.next == None:
                    h.next = node(val)
                    self.size += 1
                    break
                h  = h.next
    def middle(self):
        h = self.head
        c = 0
        target = self.size // 2
        prev = None
        while h:
            if target == c :
                prev.next = h.next
                return

            c = c + 1
            prev = h
            h = h.next
    def p(self):
        h = self.head
        while h:
            print(h.val,end= " ")
            h = h.next




if __name__ == "__main__":
    size = int(input())
    if size == 1 :
        print(-1)
        quit()
    l = input().split(" ")
    for i in range(len(l)):
        l[i] = int(l[i])
    l1 = linkedList()
    for i in l:
        l1.make(i)
    l1.middle()
    l1.p()
