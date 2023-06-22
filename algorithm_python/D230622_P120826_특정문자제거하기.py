def solution(my_string, letter):
    answer = ''

    for i in my_string:
        if i != letter:
            answer += i

    return answer


# 다른사람의 풀이
def solution(my_string, letter):
    return my_string.replace(letter, '') # replace(변경하고 싶은 문자, 변경할 문자)


solution('abcdef', 'e')
