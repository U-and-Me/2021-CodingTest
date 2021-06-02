#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    long s = (long)sqrt(n);
  
    if((long)pow(s, 2) == n){
        answer = (long)pow((s+1), 2);
    }else{
        answer = -1;
    }
    return answer;
}
