import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        String num = String.valueOf(n);
        char[] ch = new char[num.length()];
        
        for(int i = 0; i < num.length(); i++){
            ch[i] = num.charAt(i);
        }
        Arrays.sort(ch);
        for(int i = num.length() - 1; i >= 0; i--){
            str += ch[i];
        }
        answer = Long.parseLong(str);
        
        return answer;
    }
}
