import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int[] tmp = new int[arr.length];
        int num = 10, cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != num){
               tmp[cnt++] = arr[i];
               num = arr[i];
           }
        }
        answer = new int[cnt];
        for(int i = 0; i < cnt; i++)
            answer[i] = tmp[i];
        
        return answer;
    }
}
