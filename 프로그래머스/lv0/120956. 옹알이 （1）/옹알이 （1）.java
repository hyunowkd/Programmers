class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String str : babbling){
            int cnt = 0;
            
            str = str.replace("aya", "1").replace("ye", "1").replace("woo", "1").replace("ma", "1");
            
            //모든 문자가 1이면 answer에 누적
            for(char c : str.toCharArray()){
                cnt += c == '1'? 1:0;
            }
            
            if(cnt == str.length()){
                answer += 1;
            }
            
        }
        
        return answer;
    }
}