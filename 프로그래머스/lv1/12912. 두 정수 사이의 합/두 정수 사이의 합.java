class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        long la = Long.valueOf(a);
        long lb = Long.valueOf(b);
        
        for (long i = la; i <= lb; i++) {
            answer += i;
        }
        
        return answer;
    }
}