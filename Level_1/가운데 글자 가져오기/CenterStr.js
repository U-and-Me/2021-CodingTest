function solution(s) {
    let answer = '';
    let len = s.length / 2;
    
    if(s.length % 2 == 0){
        answer = s[len-1] + s[len];
    }else {
        len = Math.floor(len);
        answer = s[len];
    }
    
    return answer;
}
