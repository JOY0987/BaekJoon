import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // target에 있는 문자들만 추려 
        // 각 문자들 몇번 누르는게 최소인지 찾아서 value에 넣기
        
        HashMap<Character, Integer> needs = new HashMap<>();
        
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!needs.containsKey(c) || i < needs.get(c)) {
                    needs.put(c, i + 1);
                }
            }
        }
        for (int p = 0; p < targets.length; p++) {
            int count = 0;
            for (int i = 0; i < targets[p].length(); i++) {
                char c = targets[p].charAt(i);
                if (!needs.containsKey(c)) {
                    count = -1;
                    break;
                }
                count += needs.get(c);
            }
            answer[p] = count;
        }
        
        return answer;
    }
}