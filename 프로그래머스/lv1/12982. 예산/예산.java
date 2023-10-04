import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int i = 0;
        int count = 0;
        
        while(d[i] <= budget && budget > 0) {
            budget -= d[i];
            i++;
            count++;
            if (i == d.length) break;
        }
        
        return count;
    }
}