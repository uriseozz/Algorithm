t = int(input())

for i in range(t):
    H, W, N = map(int, input().split())
    f = 0  # 층
    ho = 0  # 호수

    # 인원/층의 나머지가 0일 때
    if N % H == 0:
        f = H * 100
        ho = N // H
    else:
        f = (N % H) * 100
        ho = 1+ N // H
    print(f+ho)