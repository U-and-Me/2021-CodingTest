class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[100];
        int position = 99;
        int th = 1;
        
        while(n != 0){
            arr[position] = n % 3;
            n /= 3;
            position--;
        }
        
        for(int i = position+1; i < arr.length; i++){
            answer += arr[i] * th;
            th *= 3;
        }
        
        return answer;
    }
}
