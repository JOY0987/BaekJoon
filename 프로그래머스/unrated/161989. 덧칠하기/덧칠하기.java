class Solution {
    
    public static boolean[] needPainted;
    
    public int solution(int n, int m, int[] section) {
        
        int start = section[0];
        int end = section[0] + (m - 1);
        int num = 1; // 처음 한 번은 무조건 페인트칠
        
        for(int st : section) {
            if (st >= start && st <= end) {
                continue;
            } else {
                start = st;
                end = st + (m - 1);
                num++;
            }
        }
        
        return num;
        
    }
}