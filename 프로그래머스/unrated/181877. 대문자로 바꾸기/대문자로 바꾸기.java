class Solution {
    public String solution(String myString) {
        char[] arr = new char[myString.length()];
        
        for(int i=0; i<myString.length(); i++){
            arr[i] = (int)myString.toCharArray()[i] > 96? (char)((int)myString.toCharArray()[i]-32) : (char)(int)myString.toCharArray()[i];
        }
        
        String answer = new String(arr);
        
        return answer;
    }
}