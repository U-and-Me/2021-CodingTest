def solution(phone_number):
    answer = ''
    p_len = len(phone_number)
    
    for i in range(0, p_len) :
        if i < p_len - 4 :
            answer += '*'
        else :
            answer += phone_number[i]   
            
    return answer
