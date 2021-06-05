import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i;
        int c_len = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(i = 0; i < c_len; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                return answer;
            }
        }
        answer = participant[i];
        return answer;
    }
}
