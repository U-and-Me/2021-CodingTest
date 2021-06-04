class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int date = 0;
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        for(int i = 0; i < a - 1; i++){
            date += day[i];
        }    
        date += b - 1;
        answer = week[date % 7];
        
        return answer;
    }
}
