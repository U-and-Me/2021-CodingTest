#include <string>
#include <cctype>

using namespace std;

bool solution(string s) {
    bool answer = true;
    int s_len = s.length();
    if(s_len == 4 || s_len == 6){
        for(int i = 0; i < s_len; i++){
            if(!isdigit(s[i])) return false;
        }
    }else return false;
    
    return answer;
}
