t = int(input())

for i in range(t):
    H, W, N = map(int, input().split())
    f = 0  # 층
    ho = 0  # 호수

    # 인원/층의 나머지가 0일 때
    # 예시 5, 10, 10
    if N % H == 0:
        f = H * 100   # 500
        ho = N // H   # 2

    # 예시 5, 10, 9
    else:
        f = (N % H) * 100  # 5/9 ... 400
        ho = 1 + N // H    # 1+1 = 2
    print(f+ho)   # 502 / 402