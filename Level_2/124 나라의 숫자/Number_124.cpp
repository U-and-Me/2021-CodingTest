#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    string num[] = {"4", "1", "2"};
    
    while(n){
        answer = num[n % 3] + answer;
        n = (n - 1) / 3;
    }
    
    
    return answer;
}
