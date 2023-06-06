def solution(n):
    for i in range(max(n, 6), (n * 6) + 1):
        if i % n == 0 and i % 6 == 0:
            print(i / 6)
            return i / 6


solution(10)


# 다른 사람의 풀이
def solution(n):
    i = 1
    while (1):
        if (6 * i) % n == 0:
            return i
        i += 1
