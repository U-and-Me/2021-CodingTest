#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

bool solution(const char* s) {
    bool answer = true;
    int count = 0;
    
    for(int i = 0; i < strlen(s); i++){
        char ch = s[i];
        
        if(ch == '(') count++;
        else count--;
        
        if(count < 0) return false;
    }    
    
    if(count == 0) answer = true;
    else answer = false;
    
    return answer;
}
