N = int(input())
result = 0

for i in range(1, N + 1):  # 모든 경우의 수를 처음부터 끝까지 비교
    a = list(map(int, str(i)))  # N을 스트링 형으로 입력받고 list에 append
    print(a)
    s = i + sum(a)
    print(s)
    if s == N:
        result = i
        break

print(result)
