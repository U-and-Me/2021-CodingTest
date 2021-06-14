function solution(arr, divisor) {
    let answer = [-1];
    let cnt = 0;
    
    for(let i = 0; i < arr.length; i++)
        if(arr[i] % divisor == 0) answer[cnt++] = arr[i];
    
    answer.sort(function (a,b){
        return a-b; }
    );
        
    return answer;
}
