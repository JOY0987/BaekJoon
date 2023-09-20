class Solution {
    public int solution(String s) {
        int answer = 0;
        int firstCnt = 0;
        int otherCnt = 0;

        char first = s.charAt(0);
        
        for (int i = 0; i < s.length(); i++) {
            if (firstCnt == otherCnt) {
                answer++;
                first = s.charAt(i);
            }
            
            if (s.charAt(i) == first) firstCnt++;
            else otherCnt++;
        }
        
        return answer;
    }
}