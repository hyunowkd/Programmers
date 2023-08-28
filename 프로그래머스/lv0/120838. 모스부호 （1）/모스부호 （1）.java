import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabet = new String[26];
        Map<String, String> morseMap = new HashMap<>();
        
        for(int i=0; i<26; i++){
            alphabet[i] = String.valueOf((char)('a' + i));
        }
        
        for(int i=0; i<26; i++){
            morseMap.put(morse[i], alphabet[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            answer += morseMap.get(arr[i]);
        }
        
        return answer;
    }
}