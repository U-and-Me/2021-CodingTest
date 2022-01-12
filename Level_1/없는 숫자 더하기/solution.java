class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int ind : numbers){
            answer -= ind;
        }
        
        return answer;
    }
}
