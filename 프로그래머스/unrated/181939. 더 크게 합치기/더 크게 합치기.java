class Solution {
    public int solution(int a, int b) {
        int left = Integer.valueOf(String.valueOf(a)+String.valueOf(b));
        int right = Integer.valueOf(String.valueOf(b)+String.valueOf(a));
        
        return left > right? left:right;
    }
}