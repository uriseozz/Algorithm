import math  # math모듈 사용을 위한 import

a, b, v = map(int, input().split())

one_day = a - b  # 하루 올라간 길이 계산
total_v = v - b  # 마지막날 낮에 도착하면 밤에 내려오지 않기 때문에
total_day = math.ceil(total_v/one_day) # 전체 이동거리에서 하루 올라간 길이 나눠주기
print(total_day)
