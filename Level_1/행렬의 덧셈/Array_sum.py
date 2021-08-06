def solution(arr1, arr2):
    answer = []
    
    for a, b in zip(arr1, arr2) :
        tmp = []
        for num1, num2 in zip(a, b) :
            tmp.append(num1 + num2)
        answer.append(tmp)
    
    return answer
