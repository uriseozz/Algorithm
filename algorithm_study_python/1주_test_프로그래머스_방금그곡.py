def solution(m, musicinfos):
    li = []
    r = []

    compare = -1

    # #인 멜로디 바꿔주기
    m = m.replace('C#', 'c').replace('D#', 'd').replace('F#', 'f').replace('G#', 'g').replace('A#', 'a')

    for i in musicinfos:
        a = i.split(',')
        start = list(map(int, a[0].split(':')))  # 음악 시작시간
        end = list(map(int, a[1].split(':')))  # 음악 종료시간
        running_time = (end[0]*60 + end[1]) - (start[0]*60 + start[1])  # 재생 시간(분으로 계산)

        # 음악 정보에서 #인 멜로디 바꿔주기
        at = a[3].replace('C#', 'c').replace('D#', 'd').replace('F#', 'f').replace('G#', 'g').replace('A#', 'a')

        if running_time < len(at):  # 음악 길이보다 재생된 시간이 짧은 경우
            at = at[:running_time]  # 처음부터 재생시간만큼만 재생
        else:  # 음악길이보다 재생된 시간이 긴 경우
            quotient, remainder = divmod(running_time, len(at))  # 몫, 나머지 = divmod(러닝타임, 멜로디 길이)
            at = quotient*at + at[:remainder]  # 반복 되기 때문에 몫에 멜로디를 곱해준 다음, 나머지만큼 멜로디를 더해준다.

        li.append([running_time, a[2], at])  # 리스트를 다시 만들어줌(running_time, 노래 제목, 멜로디)

    for i in li:  # 음악 찾기 리스트 반복
        if m in i[2]:  # 들은 멜로디(m) i[2]인 at에 포함되어 있다면,
            compare = max(compare, i[0])  # -1과 running_time을 비교하여 큰 숫자를 추출
            r.append(i)  # 조건에 맞는 i가 있다면 r이라는 list에 추가해줌

    if len(r) == 0:  # r리스트에 개수가 0이라면(조건에 일치하는 음악이 없는 경우)
        return '(None)'
    else:
        for i in range(len(r)):  #조건이 일치하는 음악이 1개 이상인경우
            if compare == r[i][0]:  # 재생시간이 제일 긴 음악인지 확인
                return r[i][1]  # 재생시간이 길다면 제목을 return 해줌