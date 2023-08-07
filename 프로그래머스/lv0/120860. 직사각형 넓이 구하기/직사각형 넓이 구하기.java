class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        height = dots[0][0] == dots[1][0]? dots[1][1]-dots[0][1] :
                dots[0][0] == dots[2][0]? dots[2][1]-dots[0][1] :
                dots[0][0] == dots[3][0]? dots[3][1]-dots[0][1] :
                dots[4][1]-dots[0][1];
        
        width = dots[0][1] == dots[1][1]? dots[1][0]-dots[0][0] :
                 dots[0][1] == dots[2][1]? dots[2][0]-dots[0][0] :
                 dots[0][1] == dots[3][1]? dots[3][0]-dots[0][0] :
                 dots[4][0]-dots[0][0];
        
        answer = Math.abs(width * height);
        
        return answer;
    }
}