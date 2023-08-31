import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = Arrays.asList(myStr.split("a|b|c")).stream().filter(i->!i.isEmpty()).toArray(String[]::new);
        String[] empty = {"EMPTY"};
        
        return arr.length == 0? empty : arr;
    }
}