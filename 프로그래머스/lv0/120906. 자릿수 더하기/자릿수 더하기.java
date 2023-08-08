class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i<(int)(Math.log10(n)+1); i++){
            answer += Character.getNumericValue(String.valueOf(n).charAt(i));
        }
        
        return answer;
    }
}