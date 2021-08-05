#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer = arr;
    
    if(answer.size() == 1) return {-1};
    
    answer.erase(min_element(answer.begin(), answer.end()));

    return answer;
}
