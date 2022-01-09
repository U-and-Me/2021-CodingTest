#include<string>
#include <iostream>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    int count = 0;
    
    for(int i = 0; i < s.length(); i++){
        string ch = s.substr(i, 1);
        
        if(ch == "(") count++;
        else count--;
        
        if(count < 0) return false;
    }
    
    if(count == 0) answer = true;
    else answer = false;
    

    return answer;
}
