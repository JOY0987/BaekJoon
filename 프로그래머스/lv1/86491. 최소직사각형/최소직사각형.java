class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWid = 0;
        int maxLen = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (maxWid < sizes[i][0]) maxWid = sizes[i][0];
            if (maxLen < sizes[i][1]) maxLen = sizes[i][1];
        }
        
        answer = maxWid * maxLen;
        
        return answer;
    }
}