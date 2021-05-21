class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0, tmp = x;
        
        while(tmp != 0){
            sum += tmp % 10;
            tmp /= 10;
        }
        if(x % sum != 0) answer = false; 
        
        return answer;
    }
}
