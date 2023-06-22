def solution(n, k):
    p = n * 12000
    c = (k - n//10) * 2000
    print(p+c)
    return p + c


solution(10, 3)
