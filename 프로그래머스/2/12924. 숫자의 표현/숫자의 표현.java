class Solution {
    public int solution(int n) {
        int answer = 1; // 15 = 15
        
        for (int i = 1; i <= n / 2; i++) {
            int sum = 0;
            int j = i;
            while (sum <= n) {
                if (sum == n) answer++;
                sum += j;
                j++;
            }
        }
        
        return answer;
    }
}