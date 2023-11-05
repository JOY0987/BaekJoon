import java.util.*;

class Solution {
    
    private int answer;
    
    private boolean[] visit;
    
    public int solution(int k, int[][] dungeons) {
        
        answer = 0;
        visit = new boolean[dungeons.length];
        
        bfs(0, k, dungeons);
        
        return answer;
    }
    
    private void bfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                bfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
            
            answer = Math.max(answer, depth);
        }
    }
}