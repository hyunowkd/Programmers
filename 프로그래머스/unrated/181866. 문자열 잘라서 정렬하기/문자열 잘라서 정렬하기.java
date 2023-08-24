import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        int length = st.countTokens();
        String[] answer = new String[length];
        
        for(int i=0; i<length; i++){
            answer[i] = st.nextToken();
        }
        Arrays.sort(answer);
        
        return answer;
    }
}