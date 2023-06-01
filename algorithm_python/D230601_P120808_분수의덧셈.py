def solution(numer1, denom1, numer2, denom2):
    answer = []

    for i in range(max(denom1, denom2), (denom1 * denom2) + 1):  # 최소공배수 구하기
        if i % denom1 == 0 and i % denom2 == 0:
            answer.append(i)
            break

    answer.insert(0, temp(answer[0], denom1, numer1) + temp(answer[0], denom2, numer2))  # 분모값에 맞춰 분자값 계산

    lcm = 0
    for i in range(min(answer[0], answer[1]), 0, -1):  # 최대공약수 구하기
        if answer[0] % i == 0 and answer[1] % i == 0:
            lcm = i
            break

    if lcm != 1:  # 최대공약수가 1이 아닐 때 약분해줌
        answer[0] = answer[0] // lcm
        answer[1] = answer[1] // lcm
    return answer


def temp(gcd, denom, numer):
    if gcd == denom:
        return numer
    else:
        return (gcd // denom) * numer


solution(1, 2, 3, 4)

# math 모듈을 사용한 풀이
from math import gcd


def solution(denum1, num1, denum2, num2):
    denum = denum1 * num2 + denum2 * num1
    num = num1 * num2
    return [denum // gcd(denum, num), num // gcd(denum, num)]


# 유클리드 호제법
# 최대공약수
def GCD(x, y):
    while y:  # y가 참일 동안
        x, y = y, x % y
    return x


# 최소공배수
def LCM(x, y):
    result = (x * y) // GCD(x, y)
    return result
