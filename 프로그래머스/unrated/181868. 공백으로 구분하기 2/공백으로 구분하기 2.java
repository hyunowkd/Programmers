import java.util.StringTokenizer;
    
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");
        int length = st.countTokens();
        String[] answer = new String[length];
        
        for(int i=0; i<length; i++){
            answer[i] = st.nextToken();
        }
        
        return answer;
    }
}