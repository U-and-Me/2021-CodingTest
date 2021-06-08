import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0, match = 0;
        int rank;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums); 
        
        for(int i = 0; i < 6; i++){
            if(lottos[i] == 0) zero++;
        }
        for(int i = zero; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]) match++;
            }
        }
        answer[0] = grade(match+zero);
        answer[1] = grade(match);
        return answer;
    }
     public int grade(int match){
        switch(match){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
