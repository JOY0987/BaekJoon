class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 0부터 9까지 찾아서 숫자로 변경
        while(true) {
            
            s = s.replace("zero", "0");
            s = s.replace("one", "1");
            s = s.replace("two", "2");
            s = s.replace("three", "3");
            s = s.replace("four", "4");
            s = s.replace("five", "5");
            s = s.replace("six", "6");
            s = s.replace("seven", "7");
            s = s.replace("eight", "8");
            s = s.replace("nine", "9");
            
            // 종료 조건
            try {
                answer = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        
        return answer;
    }
}