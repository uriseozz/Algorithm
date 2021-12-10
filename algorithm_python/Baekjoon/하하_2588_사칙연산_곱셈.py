# 결과값을 list 변수에 담고 출력하는 방법
num1 = int(input())
num2 = list(map(int, input()))

result = []

for i in range(len(num2), 0, -1):
    result.append(num1 * num2[i-1])

print(result[0], result[1], result[2], sep='\n')
print(result[0]+(result[1]*10)+result[2]*100)

#나머지를 구하는 %를 이용하여 값을 바로 출력하는 방법
num1 = int(input())
num2 = int(input())

print(num1*(num2%10))
print(num1*((num2%100)//10)) # // : 나누기 연산 후 소수점 이하의 수를 버리고 정수 부분의 수만 구함
print(num1*(num2//100))
print(num1*num2)

#range함수를 이용해 마지막 부터 시작까지 역순으로 출력하는 방법
num1 = int(input())
num2 = input()

for i in range(len(num2), 0, -1):
    print(num1 * int(num2[i-1]))

print(num1 * int(num2))