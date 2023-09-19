class Solution {
    
    public static char[] alpabet;
    
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        // a ~ z 97 ~ 122
        for (char c : s.toCharArray()) {
            int count = 0;
            while (count < index) {
                c += 1;
                if (c > 'z') c -= 26; // A를 a로 바꾸려면 -26 하면 됨
                if (skip.contains(c + "")) continue;
                else count++;
            }
            
            answer += c;
        }
            
        return answer;
    }
}