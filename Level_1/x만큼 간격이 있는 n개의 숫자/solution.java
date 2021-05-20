class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long j = 1;
        
        for(int i = 0; i < answer.length; i++, j++){
            answer[i] = x * j;
        }
        
        return answer;
    }
}
