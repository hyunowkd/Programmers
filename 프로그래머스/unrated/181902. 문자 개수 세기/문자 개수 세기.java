class Solution {
    public int[] solution(String my_string) {
        //A = 65, a = 97, a - A = 32
        int[] answer = new int[52];
        int idx = 0;
        int target = 0;
        
        for(int i=0; i<my_string.length(); i++){
            target = my_string.charAt(i);
            idx = target > 96 ? target - 97 + 26 : target - 65;
            answer[idx] = answer[idx] + 1;
        }
        
        return answer;
    }
}