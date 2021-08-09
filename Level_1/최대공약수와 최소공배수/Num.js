function solution(n, m) {
    var answer = [];
    
    for(let i = 1; i <= n || i <= m; i++)
        if(n % i == 0 && m % i == 0)
            answer[0] = i;

    answer[1] = (n * m) / answer[0];
    
    return answer;
}
