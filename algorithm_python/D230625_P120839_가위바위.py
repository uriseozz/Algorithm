def solution(rsp):
    answer = ''

    for i in rsp:
        if i == "0":
            a = "5"
        elif i == "2":
            a = "0"
        else:
            a = "2"
        answer += a
    print(answer)
    return answer


solution("205")
