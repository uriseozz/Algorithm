n = int(input()) # 26

num = n
cnt = 0

while True:
    num1 = num // 10  # 2
    num2 = num % 10  # 6
    sum_num = num1 + num2  # 2 + 6 = 8
    num = (num2 * 10) + (sum_num % 10)  # 60 + 8 = 68

    cnt += 1

    if num == n:  # num과 n이 같아 질때 break
        break

print(cnt)


num = n
cnt = 0

while True:
    num1 = num // 10  # 2
    num2 = num % 10  # 6
    sum_num = num1 + num2  # 2 + 6 = 8
    num = int(str(num2) + str(sum_num % 10))  # 숫자(문자6 + 문자8)
                                              # 60 + 8 = 68
    cnt += 1

    if num == n:  # num과 n이 같아 질 때 break
        break

print(cnt)