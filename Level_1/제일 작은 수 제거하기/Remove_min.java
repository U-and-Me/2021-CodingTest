class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0], index = 0;
        
        if(arr.length == 1){
           return new int[]{-1};
        }
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]) continue;
            else answer[index++] = arr[i];
        }        
        return answer;
    }
}
