class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int idx = 0;
        int cnt = 0;
        
        for(int i=0; i<intStrs.length; i++){
        	intStrs[i] = intStrs[i].substring(s, s+l);
        	if(Integer.parseInt(intStrs[i]) > k) cnt++;
        }
		
        answer = new int[cnt];
        for(int i=0; i<intStrs.length; i++) {
        	if(Integer.parseInt(intStrs[i]) > k) answer[idx++] = Integer.parseInt(intStrs[i]);
        }
        
        return answer;
    }
}