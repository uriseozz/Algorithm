t = int(input())
# print(t)

for i in range(t):
    stack = []
    a = input()
    for j in a:
        if j == "(":
            stack.append(j)
        else:
            if stack:  # stack이 차있을 때
                stack.pop()
            else:  # stack이 비어 있을 때
                print("NO")
                break
    else:
        if not stack:
            print("YES")
        else:
            print("NO")

