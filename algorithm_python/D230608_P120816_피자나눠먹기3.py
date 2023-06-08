def solution(slice, n):
    answer = 1
    slice_copy = slice
    while slice_copy / n < 1:
        slice_copy += slice
        answer += 1
    return answer
    # return ((n - 1) // slice) + 1


solution(7, 78)
