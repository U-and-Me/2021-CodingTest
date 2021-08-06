def solution(n):
    answer = ''
    number = ["4", "1", "2"]
    
    while n :
        answer = number[n % 3] + answer
        n = (n - 1) // 3
    
    return answer
