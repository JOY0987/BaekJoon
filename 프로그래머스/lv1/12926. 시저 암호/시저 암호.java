class Solution {
    
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer.append(' ');
                continue;
            }
            
            char code = (char) (ch + n);
            
            if (Character.isLowerCase(ch) && code > 'z') {
                code = (char) (code - 26);
            } else if (Character.isUpperCase(ch) && code > 'Z') {
                code = (char) (code - 26);
            }
             
            answer.append(code);
        }
        
        return answer.toString();
    }
}