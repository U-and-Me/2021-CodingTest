function solution(participant, completion) {
    let answer = '';
    
    participant.sort();
    completion.sort();
    
    while(participant.length){
        let p = participant.pop();
        if(p !== completion.pop()) return p;
    }
    
    return answer;
}
