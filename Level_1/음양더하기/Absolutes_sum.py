def solution(absolutes, signs):
    answer = 0
    
    for n, i in zip(absolutes, signs) :
        if i :
            answer += n
        else :
            answer -= n
    
    return answer
