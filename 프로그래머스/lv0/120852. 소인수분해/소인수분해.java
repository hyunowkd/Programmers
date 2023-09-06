import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        //n의 약수 list, 약수 중 소수 아니면 remove
        List<Integer> list = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        
        //remove하면 list의 size가 변하니까 담아놓기
        int length = list.size()-1;
        
        for(int i=length; i>=0; i--){
            for(int j=2; j<=list.get(i)/2; j++){
                if(list.get(i)%j == 0){
                    list.remove(i);
                    break;
                }
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}