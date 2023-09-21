class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            if (i == 0) answer[i] = -1;
            String subStr = s.substring(0, i);
            int n = subStr.lastIndexOf(s.charAt(i));
            if (n == -1) {
                answer[i] = -1;
                continue;
            }
            answer[i] = i - subStr.lastIndexOf(s.charAt(i));
        }
        
        return answer;
    }
}