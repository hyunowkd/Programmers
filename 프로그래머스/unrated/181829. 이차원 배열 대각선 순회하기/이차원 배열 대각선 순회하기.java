class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        // int length = Math.min(Math.min(board.length, board[0].length), k);
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(i+j > k) break;
                answer += board[i][j];
            }
        }
        
        return answer;
    }
}