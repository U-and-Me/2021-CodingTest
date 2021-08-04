class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String tmp = "";
        int[] score = new int[3];
        int index = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            switch(dartResult.charAt(i)){
                case '*' :
                    score[index-1] *= 2;
                    if(index > 1) score[index-2] *= 2;
                    break;
                case '#' :
                    score[index-1] *= -1;
                    break;
                case 'S' :
                    score[index++] = (int)Math.pow(Integer.parseInt(tmp), 1);
                    tmp = "";
                    break;
                case 'D' :
                    score[index++] = (int)Math.pow(Integer.parseInt(tmp), 2);
                    tmp = "";
                    break;
                case 'T' :
                    score[index++] = (int)Math.pow(Integer.parseInt(tmp), 3);
                    tmp = "";
                    break;
                default :
                    tmp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }
        
        for(int i = 0; i < score.length; i++)
            answer += score[i];
        
        return answer;
    }
}
