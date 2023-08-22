class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        answer = rsp.replace("0", "r").replace("2", "s").replace("5", "p")
                    .replace("r", "5").replace("s", "0").replace("p", "2");
        
        return answer;
    }
}