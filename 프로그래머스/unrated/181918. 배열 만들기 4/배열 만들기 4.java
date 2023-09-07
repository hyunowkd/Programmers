import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            while(st.peek() >= arr[i]){
                st.pop();
                if(st.isEmpty()) break;
            }
            st.push(arr[i]);
        }
        
        int[] answer = new int[st.size()];
        System.out.println(st.size());
        for(int i=0; i<answer.length; i++){
            answer[answer.length - 1 - i] = st.pop();
        }
        
        return answer;
    }
}