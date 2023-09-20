import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        // 오른쪽 값 기준 오름차순 정렬
        Arrays.sort(targets, (o1, o2) -> {
            return o1[1] - o2[1];
        });
        
        int count = 0;
        int left = targets[0][0];
        int right = targets[0][1];
        int bang = -1;
        
        for(int i = 0; i < targets.length; i++) {
            if (bang < targets[i][0]) {
                count++;
                bang = targets[i][1] - 1;
            }
        }
        
        return count;
    }
}