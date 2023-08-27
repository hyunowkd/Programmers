class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length1 = intervals[0][1] - intervals[0][0] + 1;
        int length2 = intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[length1 + length2];
        
        for(int i=0; i<length1; i++){
            answer[i] = arr[i + intervals[0][0]];
        }
        
        for(int i=0; i<length2; i++){
            answer[i + length1] = arr[i + intervals[1][0]];
        }
        
        return answer;
    }
}