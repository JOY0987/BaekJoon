class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        try {
            if (s.length() == 4 || s.length() == 6) {
                int i = Integer.parseInt(s);
                answer = true;
            }
        } catch (NumberFormatException e) {
            answer = false;
        }
        return answer;
    }
}