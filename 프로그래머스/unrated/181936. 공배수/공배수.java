class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        answer = Math.floor(number*1.0/n) == number*1.0/n &&
            Math.floor(number*1.0/m) == number*1.0/m ? 1:0;
        
        return answer;
    }
}