import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<strArr.length; i++){
            arr[i] = strArr[i].length();
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(map.get(arr[i]) == null){
        		map.put(arr[i], 1);
        	}else {
        		map.put(arr[i], map.get(arr[i])+1);
        	}
        }
        
        return Collections.max(map.values());
    }
}