function solution(phone_number) {
    let answer = '';
        let len = phone_number.length;
    for(let i = 0; i < len; i++){
        answer += i < len-4 ? "*" : phone_number.charAt(i);
    }
    return answer;
}
