import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++){
            strings[i] = strings[i].substring(n, n+1) + strings[i];
        }
        Arrays.sort(strings);
    
        for(int i = 0; i < len; i++)
            answer[i] = strings[i].substring(1);
        
        return answer;
    }
}
