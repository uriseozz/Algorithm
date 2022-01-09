
while True:
    a = input()
    stack = []

    if a == ".":
        break

    for i in a:
        if i == "[" or i == "(":
            stack.append(i)
        elif i == "]":
            if len(stack) != 0 and stack[-1] == "[":  # stack의 개수가 0이 아니고, stack의 마지막이 '[' 일때
                stack.pop()  # '['을 pop해줌
            else:
                stack.append("]")
                break
        elif i == ")":
            if len(stack) != 0 and stack[-1] == "(":  # stack의 개수가 0이 아니고, stack의 마지막이 ')' 일때
                stack.pop()  # '('을 pop해줌
            else:
                stack.append(")")
                break
    if len(stack) == 0:
        print('yes')
    else:
        print('no')
