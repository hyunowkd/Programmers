import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0]; int b = slicer[1]; int c = slicer[2];
        
        switch(n){
            case 1: return Arrays.copyOfRange(num_list, 0, b + 1);
            case 2: return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3: return Arrays.copyOfRange(num_list, a, b + 1);
            case 4: int[] arr = new int[(b-a)/c + 1];
                for(int i=0; i<arr.length; i++){
                    arr[i] = num_list[a + c*i];
                }
                return arr;
            default: return null;
        }
    }
}