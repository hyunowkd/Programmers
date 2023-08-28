class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) != '-'){
                answer += my_string.charAt(i);
            }
            
            for(int j=i+1; j<my_string.length(); j++){
                if(my_string.charAt(i) == my_string.charAt(j)){
                    my_string = my_string.replace(my_string.charAt(i)+"", "-");
                }
            }
        }
        
        return answer;
    }
}