def solution(x):
    answer = True
    tmp = str(x)
    sum = 0
    
    for i in range(len(tmp)) :
        sum += int(tmp[i])
    
    if x % sum != 0 :
        answer = False
    
    return answer
