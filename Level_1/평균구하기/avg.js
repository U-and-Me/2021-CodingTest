function solution(arr) {
    let answer = 0;
    let cnt = 0;
    
    for(let i in arr){
        answer += arr[i];
        cnt++;
    }
    answer /= cnt;
    
    return answer;
}
