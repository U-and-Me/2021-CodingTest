#include <string>
#include <vector>

using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> answer(n);
    long cnt = 1;
    
    for(int i = 0; i < answer.size(); i++, cnt++){
        answer[i] = x * cnt;
    }
    
    return answer;
}
