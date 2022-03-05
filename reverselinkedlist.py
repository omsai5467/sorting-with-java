class node:
    def __init__(self,val):
        self.val = val
        self.next = None
         
class linkedList():
    def __init__(self):
        self.head = None
    def add(self,val):
        if self.head == None:
            self.head = node(val)
            return
        else:
            h = self.head
            while h:
                if h.next == None:
                    h.next = node(val)
                    return
                h = h.next
            # h.next = node(val)
    def reverse(self):
        h = self.head
        temp = None
        pre = None
        while h:
            temp = h.next
            h.next  = pre
            pre = h
            h = temp
        self.head = pre
    def show(self):
        h = self.head
        while h :
            print(h.val)
            h = h.next



if __name__ == "__main__":

    l= linkedList()
    y = input("")
    x = input().split(" ")
    for i in  x:
        l.add(i)

    l.reverse()
    l.show()
