class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        char[] reverse = new char[length];
        
        for(int i=0; i<length; i++){
            reverse[i] = String.valueOf(n).toCharArray()[length-1-i];
            answer[i] = (int)reverse[i] - 48;
        }
        
        
        
        return answer;
    }
}