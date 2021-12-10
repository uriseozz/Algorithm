
a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(int(a/b))
print(a%b)

# 다른풀이
a, b = map(int, input().split(" "))

def arithmetic_operation(a, b):
  print(a+b, a-b, a*b, int(a/b), a%b, sep="\n")

arithmetic_operation(a, b)