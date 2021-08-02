def solution(price, money, count):
    answer = -1
    tot = 0
    
    for i in range(1, count+1) :
        tot += price * i
    
    if tot > money :
        answer = tot - money
    else :
        answer = 0

    return answer
