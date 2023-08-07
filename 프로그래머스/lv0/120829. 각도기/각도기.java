class Solution {
    public int solution(int angle) {
        int answer = 0;
        // if(angle == 90){answer = 2;}
        // else if(angle == 180){answer = 4;}
        // else if(angle<90){answer = 1;}
        // else{answer = 3;}
        
        answer = angle/90.0 == 1? 2 :
            angle/90.0 == 2? 4 :
                Math.floor(angle/90.0) == 0? 1 : 3;
        return answer;
    }
}