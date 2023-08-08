import java.util.Arrays;

class Solution {
    static int multiple;
    static int sum;
    public int solution(int[] num_list) {
        int answer = 0;
        multiple = 1;
        sum = 0;
        
        Arrays.stream(num_list).forEach(i -> multiple *= i);
        Arrays.stream(num_list).forEach(i -> sum += i);
        answer = multiple < sum*sum? 1:0;
        
        return answer;
    }
}