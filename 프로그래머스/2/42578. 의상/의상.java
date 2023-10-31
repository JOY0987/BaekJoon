import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> clothesMap = new HashMap<>();

        for (String[] sa : clothes) {
            clothesMap.put(sa[1], clothesMap.getOrDefault(sa[1], 0) + 1);
        }

        int answer = 1;
        
        for (String key : clothesMap.keySet()) {
            answer *= clothesMap.get(key) + 1;
        }        
        
        return answer - 1;
    }
}