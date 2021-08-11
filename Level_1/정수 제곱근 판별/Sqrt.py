import math
def solution(n):
    answer = 0
    sqrt = n ** (1/2)
    
    if sqrt % 1 == 0 :
        answer = math.pow(sqrt+1, 2)
    else :
        return -1
    
    return answer
