function solution(price, money, count) {
    var tot = 0;
    
    for(var i = 1; i <= count; i++)
        tot += price * i;

    return tot > money ? tot-money : 0;
}
