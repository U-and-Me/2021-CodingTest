function solution(n) {
    let answer = "";
    let number = ["4", "1", "2"];
    
    while(n  > 0){
        answer = number[n % 3] + answer;
        n = Math.floor((n-1) / 3);
    }
    
    
    return answer;
}
