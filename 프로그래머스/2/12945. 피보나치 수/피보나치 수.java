class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] piboNums = new int[n + 1];
        
        piboNums[0] = 0;
        piboNums[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            piboNums[i] = (piboNums[i - 1] + piboNums[i - 2]) % 1234567;
        }
        
        return piboNums[n];
    }
}