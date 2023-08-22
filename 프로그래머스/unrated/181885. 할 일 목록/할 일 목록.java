import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        int length = 0;
        
        for(int i=0; i<finished.length; i++){
            length += finished[i]? 0:1;
        }
        
        String[] answer = new String[length];
        
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}