class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int giving = n / a;
            int taking = giving * b;
            n = n - giving * a + taking;
            answer += taking;
        }
        
        return answer;
    }
}