class Solution {
    public String solution(String s) {
        String answer = "";
        char[] str = new char[s.length()];
        
        for(int i = 0; i < str.length; i++)
            str[i] = s.charAt(i);
        
        for(int i = 0; i < str.length; i++){
            for(int j = i + 1; j < str.length; j++){
                if(str[i] < str[j]){
                    char tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }
        
        for(int i = 0; i < str.length; i++)
            answer += str[i];
        
        return answer;
    }
}
