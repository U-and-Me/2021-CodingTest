import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        int index = 0;
        
        for(int i = 0; i < len; i++){
            int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
            index = 0;
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                tmp[index++] = array[j];
            }
            Arrays.sort(tmp);
            answer[i] = tmp[(commands[i][2] - 1)];
        } 
        
        
        return answer;
    }
}
