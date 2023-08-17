class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] tmp = my_string.toCharArray();
        
        for(int i=0; i<tmp.length; i++){
            if(alp.charAt(0) == tmp[i]){
                tmp[i] = Character.toUpperCase(tmp[i]);
            }
            answer += tmp[i];
        }
        
        return answer;
    }
}