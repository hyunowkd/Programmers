import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        //한글자씩 돌려서 같은거 있으면 replace 이용해 공백으로 바꾸기
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    s = s.replace(""+s.charAt(i), " ");
                }
            }
        }
        
        //공백제거, 순차정렬
        return Arrays.stream(s.split("")).filter(i->!i.equals(" ")).sorted().collect(Collectors.joining(""));
    }
}