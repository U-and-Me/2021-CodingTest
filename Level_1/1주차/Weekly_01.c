#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int price, int money, int count) {
    long long answer = 0, tot = 0;
    
    for(int i = 1; i <= count; i++)
        tot += price * i;
    
    if(tot > money)
        answer = tot - money;
    
    return answer;
}
