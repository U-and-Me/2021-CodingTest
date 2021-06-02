function solution(n) {
    let answer = 0;
    let s = Math.sqrt(n);
    if(s % 1 == 0){
        answer = (s+1)*(s+1);
    }else{
        answer = -1;
    }
    return answer;
}
