function solution(arr) {
    let answer = arr;
    
    if(answer.length == 1) return [-1];
    
    let min = Math.min.apply(null, answer);
    arr.splice(arr.indexOf(min), 1);
    
    return answer;
}
