import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {
			    answer.add(Character.getNumericValue(my_string.charAt(i)));
		    }
        }
        
        Collections.sort(answer);
            
        return answer.stream().mapToInt(i -> i).toArray();
    }
}