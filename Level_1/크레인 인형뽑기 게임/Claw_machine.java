class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0, index = 0;
        int[] temp = new int[moves.length];
        
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    temp[index] = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    if(index >= 1 && temp[index] == temp[index-1]){
                        answer += 2;
                        index -= 2;
                    }
                    index++;
                    break;
                }
            }
        }
        return answer;
    }
}
