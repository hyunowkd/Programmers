class Solution {
    public int[] solution(int[] arr) {
        int jisoo = 0;
        
        while(true){
            if(Math.pow(2, jisoo) >= arr.length){
                break;
            }
            jisoo++;
        }
        
        int[] answer = new int[(int)Math.pow(2, jisoo)];
        
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}