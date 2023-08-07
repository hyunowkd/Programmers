class Solution {
    public String solution(String a, String b) {
        String answer = "";
        String result = "";
        int target = 0;
        int temp = 0;
        int length = a.length() > b.length()? a.length() : b.length();
        
        for(int i=0; i<length; i++){
            target = temp;
            target += a.length()-(i+1) >= 0? (int)a.charAt(a.length()-(i+1)) - 48: 0;
            target += b.length()-(i+1) >= 0? (int)b.charAt(b.length()-(i+1)) - 48: 0;
            answer += (char)(target%10 + 48);
            temp = target/10;
        }
        
        if(temp == 1){
            answer += '1';
        }
        
        for(int i=0; i<answer.length(); i++){
            result += answer.charAt(answer.length()-(i+1));
        }
            
        return result;
    }
}