class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        
        boolean isUpper = false;
        int n = 0;
        s = s.toLowerCase();
        
        for (char c : s.toCharArray()) {
            // 문자를 만나면 짝/홀 계산 시작
            if (c != ' ') {
                if (n % 2 == 0) {
                    c = Character.toUpperCase(c);
                }
                n++;
            }
            // 공백을 만나면 false
            if (c == ' ') {
                isUpper = false;
                n = 0;
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}