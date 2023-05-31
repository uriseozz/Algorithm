def solution(n):
    answer = []
    for a in range(1, n+1):
        if a % 2 != 0:
            answer.append(a)

    return answer


solution(12)
