n = int(input())

bag = 0

while n >= 0:

    # 5의 배수이면 바로 나눠서 설탕봉지 구하기
    if n % 5 == 0:
        bag += (n // 5)
        print(bag)
        break

    # 5의 배수가 아니면 5의 배수가 될 때까지 설탕 -3
    n -= 3
    # 5의 배수가 될때까지 설탕봉지 +1
    bag += 1

else:
    # 음수가 되면 -1 출력하기
    print(-1)
