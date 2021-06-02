#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

long long solution(long long n) {
    long long answer = 0;
    long s = (long)sqrt(n);
    if(s*s == n){
        answer = (long)pow((s+1), 2);
    }else{
        answer = -1;
    }
    return answer;
}
