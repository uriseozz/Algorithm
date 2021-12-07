input = [0, 3, 5, 6, 1, 2, 4]


def find_max_plus_or_multiply(array):
    multiply_sum = 0
    for num in array:
        if num < 2 or multiply_sum <= 1:
            multiply_sum += num
            print(multiply_sum)
        else:
            multiply_sum *= num
            print(multiply_sum)
    return multiply_sum


result = find_max_plus_or_multiply(input)
print(result)