class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        
        s = s.toLowerCase();
        char[] words = s.toCharArray();
        
        for (int i = 0; i < words.length; i++) {
            char c = words[i];
            
            if (c == ' ') {
                sb.append(" ");
                flag = true;
            } else {
                if (flag && c >= 'a' && c <= 'z') {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
                flag = false;
            }
        }
        
        return sb.toString();
    }
}