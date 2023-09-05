import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] after = arr.clone();
        int[] before = {};
        int answer = -1;
        
        while(!Arrays.equals(before, after)){
            before = after.clone();
            
            for(int i=0; i<arr.length; i++){
                if(before[i] >= 50 && before[i]%2 == 0){
                    after[i] = after[i]/2;
                }else if(before[i] < 50 && before[i]%2 == 1){
                    after[i] = after[i] * 2 + 1;
                }
            }
            
            answer++;
        }
        
        return answer;
    }
}