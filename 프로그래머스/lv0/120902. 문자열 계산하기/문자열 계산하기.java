import java.util.*;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        StringBuilder sb = new StringBuilder();
        int answer = Integer.parseInt(st.nextToken());
        
        while(st.hasMoreTokens()){
            if(st.nextToken().equals("+")){
                answer += Integer.parseInt(st.nextToken());
            }else{
                answer -= Integer.parseInt(st.nextToken());
            }
        }
        
        return answer;
    }
}