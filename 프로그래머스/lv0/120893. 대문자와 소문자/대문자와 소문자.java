class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ca = my_string.toCharArray();
        
        for(int i=0; i<ca.length; i++){
            if(ca[i] < 97){
                ca[i] = Character.toLowerCase(ca[i]);
            }else{
                ca[i] = Character.toUpperCase(ca[i]);
            }
            answer += ca[i];
        }
        
        return answer;
    }
}