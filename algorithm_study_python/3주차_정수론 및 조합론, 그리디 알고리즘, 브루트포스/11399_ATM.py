n = int(input())
p = list(map(int, input().split()))

num = 0
p.sort()  # 앞에 숫자가 작을 수록 시간이 줄어들기 때문에 시간을 오름차순으로 정렬

for i in range(n):  # 0, 1, 2, 3, 4
    # print(i)
    for j in range(i + 1):  # 1 / 1,2 / 1,2,3 / 1,2,3,4 /1,2,3,4,5
        num += p[j]
        # print(j)
        # print(p[j])

print(num)
