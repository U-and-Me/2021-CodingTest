class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];
        int clear = 0, stay = 0;
        
        for(int i = 0; i < fail.length; i++){
            clear = 0;
            stay = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i + 1) stay++;
                if(stages[j] >= i + 1) clear++;
            }
            fail[i] = (double)stay / clear;
            answer[i] = i + 1;
        }
        
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<answer.length-i-1; j++) {
                if(fail[j] < fail[j+1]) {
                    double tmp1 = fail[j];
                    fail[j] = fail[j+1];
                    fail[j+1] = tmp1;
                    int tmp2 = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tmp2;
                }
            }
        }
   
        return answer;
    }
}
