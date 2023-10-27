class Solution {
    public long solution(int n) {
        // DP 문제
        long[] dp = new long[2001]; 
        
        dp[1] = 1L; // 1
        dp[2] = 2L; // 1 + 1, 2
        
        for (int i = 3; i < 2001; i++) {
            dp[i] = ( dp[i - 1] + dp[i - 2] ) % 1234567;
        }
        
        return dp[n];
    }
}