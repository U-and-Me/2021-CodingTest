class Solution {
    public int[] solution(long n) {
        int[] answer;
        int cnt = 0;
        long tmp = n;
        
        while(tmp != 0){
            tmp /= 10;
            cnt++;
        }
        answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }       
        return answer;
    }
}
