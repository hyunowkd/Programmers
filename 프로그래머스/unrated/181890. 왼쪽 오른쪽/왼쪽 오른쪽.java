import java.util.Arrays;
    
class Solution {
    public String[] solution(String[] str_list) {
        int index = 0;
        int dir = 0;
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){index = i; dir = -1; break;}
            else if(str_list[i].equals("r")){index = i; dir = 1; break;}
        }
        
        String[] answer = {};
        
        if(dir < 0){
            answer = Arrays.copyOfRange(str_list, 0, index);
        }else{
            answer = Arrays.copyOfRange(str_list, index+1, str_list.length);
        }
        
        return answer;
    }
}