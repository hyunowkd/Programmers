import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -2;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                if(start == -1) {
                    start = i;
                    continue;
                }
                end = i;
            }
        }
        
        if(end - start == -1){
            return new int[] {-1};
        }
        
        if(end == -2) end = start;
        
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}