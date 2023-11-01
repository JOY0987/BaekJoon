import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        // 100%를 채우는데 걸리는 일수를 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i]) % speeds[i] == 0 ?
                        (100 - progresses[i]) / speeds[i]
                        : (100 - progresses[i]) / speeds[i] + 1;
            queue.add(days);
        }
        
        int x = queue.poll();
        int count = 1;
        
        while (!queue.isEmpty()) {
            // 이전 작업이 현재 작업보다 걸리는 일수가 더 크거나 같을 경우, 같이 배포
            if (x >= queue.peek()) {
                count++;
            } else { // 현재 작업이 더 오래 걸리는 경우, 배포개수 초기화하고 이전 작업을 현재 작업으로 교체
                list.add(count);
                count = 1;
                x = queue.peek();
            }
            queue.poll();
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}