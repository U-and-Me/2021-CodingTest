class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0, t_cnt = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p_cnt++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                t_cnt++;
            }
        }
        
        if(p_cnt != t_cnt) answer = false;

        return answer;
    }
}
