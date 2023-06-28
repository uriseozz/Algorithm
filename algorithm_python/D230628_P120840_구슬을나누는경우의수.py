def solution(balls, share):
    a=1
    b=1
    c=1


    for i in range(1, balls - share + 1):
        a *= i

    for i in range(1, balls + 1):
        b *= i

    for i in range(1, share + 1):
        c *= i

    answer = b//(a * c)

    print(answer)
    return answer


solution(3, 2)
