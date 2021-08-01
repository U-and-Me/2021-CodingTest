function solution(x) {
    let answer = true;
    let sum = 0, tmp = x;
    
    while(tmp > 0){
        sum += tmp % 10;
        tmp = Math.floor(tmp/10);
    }
    answer = (x % sum) === 0 ? true : false;
    
    return answer;
}
