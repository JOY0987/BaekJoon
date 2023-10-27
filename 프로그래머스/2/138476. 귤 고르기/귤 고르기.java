import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> keyList = new ArrayList<>(map.keySet());
        
        Collections.sort(keyList, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        
        for (int key : keyList) {
            k -= map.get(key);
            answer++;
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}