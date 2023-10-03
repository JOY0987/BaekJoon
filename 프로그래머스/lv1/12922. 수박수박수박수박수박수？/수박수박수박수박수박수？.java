class Solution {
    public String solution(int n) {
        String subak = "수박";
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < n / 2; i++) {
            sb.append(subak);
        }
        
        if (n % 2 != 0) sb.append("수");
        
        return sb.toString();
    }
}