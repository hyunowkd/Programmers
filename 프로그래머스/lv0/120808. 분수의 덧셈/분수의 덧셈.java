class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int son = numer1*denom2+numer2*denom1;
        int mom = denom1*denom2;
        int max = 0;
        
        for(int i=1; i<=Math.min(son, mom); i++){
            if(son%i==0 && mom%i==0){
                max = i;
            }
        }
        
        answer[0] = son/max;
        answer[1] = mom/max;
            
        return answer;
    }
}