class Solution {
    public int solution(int n) {
        int a = 0;
        
        while(n >= factorial(++a)){}
        
        return a-1;
    }
    
    public static int factorial(int n){
        if(n == 0) return 1;
        return factorial(n-1) * n;
    }
}