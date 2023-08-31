import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = Arrays.asList(myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" "));
        
        String[] arr = list.stream().filter(i->i.length()!=0).toArray(String[]::new);
        String[] empty = {"EMPTY"};
        return arr.length == 0? empty : arr;
    }
}