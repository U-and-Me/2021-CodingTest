class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int a_len = arr.length;
        
        for(int i = 0; i < a_len; i++){
            answer += arr[i];
        }
        answer /= a_len;
        
        return answer;
    }
}
