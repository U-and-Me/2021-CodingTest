class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left_h = 10, right_h = 12;
        int l_len, r_len;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0) numbers[i] = 11;
            if(numbers[i] % 3 == 1){
                answer += "L";
                left_h = numbers[i];
            }else if(numbers[i] % 3 == 0){
                answer += "R";
                right_h = numbers[i];
            }else{
                l_len = Math.abs(left_h - numbers[i])/3 + Math.abs(left_h - numbers[i])%3;
                r_len = Math.abs(right_h - numbers[i])/3 + Math.abs(right_h - numbers[i])%3;
                if(l_len < r_len){
                    answer += "L";
                    left_h = numbers[i];
                }else if(l_len > r_len){
                    answer += "R";
                    right_h = numbers[i];
                }else{
                    if(hand.equals("right")){
                        answer += "R";
                        right_h = numbers[i];
                    }else{
                        answer += "L";
                        left_h = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}
