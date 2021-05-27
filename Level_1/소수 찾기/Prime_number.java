class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        
        for(int i = 2; i <= n; i++)
            arr[i] = true;
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(arr[i] == true)
                for(int j = i; i*j <= n; j++)
                    arr[i*j] = false;
        }
        for(int i = 2; i < arr.length; i++)
            if(arr[i] == true)
                answer++;
        
        return answer;
    }
}
