a, b = map(int, input().split())


def gcd(a, b):
    while b > 0:
        a, b = b, a % b  # 18, 6 / 6, 0
    return a


def lcm(a, b):
    return a * b // gcd(a, b)  # 432 // 6 = 72


print(gcd(a, b))  # 6
print(lcm(a, b))  # 72

## 다른풀이 : 파이썬 내장함수

import math

a, b = map(int, input().split())

print(math.gcd(a, b))
print(math.lcm(a, b))
