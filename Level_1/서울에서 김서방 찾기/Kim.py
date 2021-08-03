def solution(seoul):
    answer = ''
    index = 0
    for i in seoul :
        if i == 'Kim' :
            answer = '김서방은 {}에 있다'.format(seoul.index(i))
        index += 1;
            
    return answer
