class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int tmp;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                tmp = s.charAt(i) + n;
                if(tmp > 'Z') answer += (char)(tmp - 26);
                else answer += (char)(tmp);
            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                tmp = s.charAt(i) + n;
                if(tmp > 'z') answer += (char)(tmp - 26);
                else answer += (char)(tmp);
            }else answer += " ";
        }
        
        return answer;
    }
}
