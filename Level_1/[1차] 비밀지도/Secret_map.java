class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] s1 = new String[n];
        String[] s2 = new String[n];
        int[] b1 = new int[n];
        int[] b2 = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = "";
            s1[i] = "";
            s2[i] = "";
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                b1[j] = arr1[i] % 2;
                arr1[i] /= 2;
                b2[j] = arr2[i] % 2;
                arr2[i] /= 2;
            }
            for(int k = n-1; k >= 0; k--){
                if(b1[k] == 1) s1[i] += "#";
                else s1[i] += " ";
                if(b2[k] == 1) s2[i] += "#";
                else s2[i] += " ";
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(s1[i].charAt(j) == '#' || s2[i].charAt(j) == '#') answer[i] += '#';
                else answer[i] += " ";
            }
        }
        
        return answer;
    }
}
