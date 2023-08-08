import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String message = "";
        
        if(n%2 == 0){
            message = n + " is even";
        }else{
            message = n + " is odd";
        }
        System.out.print(message);
    }
}