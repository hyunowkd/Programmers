class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length-1) / n + 1];
        int target = 0;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[target];
            target += n;
        }
        
        return answer;
    }
}