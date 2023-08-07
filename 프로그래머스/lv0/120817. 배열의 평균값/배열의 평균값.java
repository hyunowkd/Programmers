import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        // double answer = 0;
        // for(int num : numbers){
        //     answer += num;
        // }
        // return answer / numbers.length;
        // return Arrays.stream(numbers).average().getAsDouble();
        return (double)Arrays.stream(numbers).sum() / numbers.length;
    }
}