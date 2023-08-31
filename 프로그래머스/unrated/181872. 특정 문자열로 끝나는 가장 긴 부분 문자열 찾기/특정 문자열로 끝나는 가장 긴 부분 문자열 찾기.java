class Solution {
    public String solution(String myString, String pat) {
        String flip = "";
        String tap = "";
        int idx = 0;
        
        for(int i=0; i<myString.length(); i++){
            flip += myString.charAt(myString.length()-1-i);
        }
        
        for(int i=0; i<pat.length(); i++){
            tap += pat.charAt(pat.length()-1-i);
        }
        
        idx = myString.length() - flip.indexOf(tap);
        
        return myString.substring(0, idx);
    }
}