function solution(a, b) {
    let answer = 0;
    
    if(a > b){
        let tmp = b;
        b = a;
        a = tmp;
    }
    
    for(let i = a; i <= b; i++)
        answer += i;
    
    return answer;
}
