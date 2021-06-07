import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int tmp;        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                tmp = numbers[i] + numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }   
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        Arrays.sort(answer);
        
        return answer;
    }
}
