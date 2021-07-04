#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* phone_number) {
    char* answer = (char*)malloc(sizeof(char)*strlen(phone_number) + 1);
    strcpy(answer, phone_number);
    int p_len = strlen(phone_number);
    for(int i = 0; i < p_len - 4; i++){
       answer[i] = '*';
    }
    return answer;
}
