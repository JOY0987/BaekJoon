import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자들에게 값 1씩 부여
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        // 완주자 -1
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        
        // 완주하지 못한 자는 값이 0 보다 큼
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}