#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {
    string answer = "";
    int p_len = phone_number.length();
    for(int i = 0; i < p_len; i++){
        if(i < p_len - 4) answer += "*";
        else answer += phone_number[i];
    }
    return answer;
}
