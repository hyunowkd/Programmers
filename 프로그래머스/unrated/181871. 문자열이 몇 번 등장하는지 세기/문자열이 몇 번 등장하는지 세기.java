class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        while(myString.contains(pat)){
            myString = myString.substring(myString.indexOf(pat) + 1, myString.length());
            answer++;
        }
        
        return answer;
    }
}