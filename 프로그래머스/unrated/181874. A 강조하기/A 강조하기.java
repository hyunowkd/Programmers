class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] lowerString = myString.toLowerCase().toCharArray();
            
        for(int i=0; i<lowerString.length; i++){
            if(lowerString[i] == 'a') lowerString[i] = 'A';
            answer += lowerString[i];
        }
        
        return answer;
    }
}