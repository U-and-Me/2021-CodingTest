using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 0, tot = 0;
    
    for(int i = 1; i <= count; i++)
        tot += price * i;
    
    return tot > money ? tot-money : answer;
}
