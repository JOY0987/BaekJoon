class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        int middle = len / 2;
        
        if (len % 2 == 0) {
            sb.append(s.substring(middle - 1, middle + 1));     
        } else {
            sb.append(s.charAt(middle));
        }
        return sb.toString();
    }
}