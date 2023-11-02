import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 내림차순 실행순서
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int priority : priorities) {
            queue.add(priority);
        }
        
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}