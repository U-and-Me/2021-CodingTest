#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <ctype.h>

bool solution(const char* s) {
    bool answer = true;
    if(strlen(s) == 4 || strlen(s) == 6){
        for(int i = 0; i < strlen(s); i++){
            if(!isdigit(s[i])) return false;
        }
    }else return false;
    
    return answer;
}
