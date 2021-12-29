import sys

input = sys.stdin.readline
n = int(input())

stack = []

# def push(x):
#     stack.append(x)
#
# def pop():
#     if len(stack) == 0 :
#         print(-1)
#     else:
#         print(stack.pop())
#
# def size():
#     print(len(stack))
#
# def empty():
#     if len(stack) == 0:
#         print(1)
#     else:
#         print(0)
#
# def top():
#     if len(stack) == 0:
#         print(-1)
#     else:
#         print(stack[-1])
#
# for i in range(n):
#     command = input().split()
#     if(command[0] == 'push'):
#         push(command[1])
#     if (command[0] == 'pop'):
#         pop()
#     if (command[0] == 'size'):
#         size()
#     if (command[0] == 'empty'):
#         empty()
#     if (command[0] == 'top'):
#         top()
#

###########################################


for i in range(n):
    command = sys.stdin.readline().split()

    if command[0] == 'push':
        stack.append(command[1])

    elif command[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())

    elif command[0] == 'size':
        print(len(stack))

    elif command[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)