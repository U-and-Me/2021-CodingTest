def solution(arr):
    answer = arr
    
    if(len(answer) == 1) :
        return [-1]
    
    answer.remove(min(answer))
    
    return answer
