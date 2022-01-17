#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

int compare(const void *a, const void *b)
{
    return -(strcmp((char *)a, (char *) b));
};

char* solution(const char* s) {
    char* answer = (char*)malloc(sizeof(char) * strlen(s));
    char tmp[strlen(s)];
    
    strcpy(tmp, s);
    qsort(tmp, strlen(s), sizeof(char), compare);
    
    strcpy(answer, tmp);
    
    return answer;
}
