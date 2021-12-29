class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self, value):
        self.head = Node(value)

    def append(self, value):
        cur = self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = Node(value)

    def print_all(self):
        cur = self.head
        while cur is not None:
            print(cur.data)
            cur = cur.next

    def get_node(self, index):
        node = self.head
        count = 0
        while count < index:
            node = node.next
            count += 1
        return node

    def add_node(self, index, value):
        new_node = Node(value)  # [6]
        if index == 0:
            new_node.next = self.head  # [6] -> [5]
            return

        new_nod = Node(value)
        node = self.get_node(index)
        next_node = node.next
        node.next = new_nod
        new_nod.next = next_node

        return "index 번째 Node 뒤에 value 를 추가하세요!"


linked_list = LinkedList(5)
linked_list.append(12)
linked_list.append(8)
linked_list.add_node(1, 6)
linked_list.print_all()