#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int n) {
    char* answer = (char*)malloc(sizeof(char)*n*3 + 1);
    for(int i = 0; i < n; i++){
        answer[i] = 0;
    }
    for(int i = 1; i <= n; i++){
        if(i % 2 == 1) strcat(answer, "수");
        else strcat(answer, "박");
    }
    return answer;
}
