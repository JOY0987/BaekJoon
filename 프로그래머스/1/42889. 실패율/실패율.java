import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        // 스테이지 - 실패율
        Map<Integer, Double> failures = new HashMap<>();
        // 도달했으나 클리어하지 못한 플레이어 수
        int[] failPlayerCnt = new int[N + 2];
        // 도달한 플레이어 수
        int[] arrivePlayerCnt = new int[N + 2];
        
        for (int user : stages) {
            failPlayerCnt[user]++;
            for (int i = 1; i <= user; i++) {
                arrivePlayerCnt[i]++;
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (arrivePlayerCnt[i] == 0) {
                failures.put(i, 0.0);
            } else {
                failures.put(i, (double) failPlayerCnt[i] / arrivePlayerCnt[i]);
            }
        }
        
        // 실패율로 정렬
        List<Integer> sortStages = new ArrayList<>(failures.keySet());
        Collections.sort(sortStages, (o1, o2) -> Double.compare(failures.get(o2), failures.get(o1)));
        
        int[] answer = new int[sortStages.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sortStages.get(i);
        }
        
        return answer;
    }
}