function solution(s){
    var answer = true;
    var count = 0;
    
    for(var i = 0; i < s.length; i++){
        var ch = s.charAt(i);
        
        if(ch == '(') count++;
        else count--;
        
        if(count < 0) return false;
    }
    
    if(count == 0) answer = true;
    else answer = false;

    return answer;
}
