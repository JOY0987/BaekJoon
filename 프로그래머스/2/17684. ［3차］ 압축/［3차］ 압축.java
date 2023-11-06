import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>(); // 글자, 색인번호
        StringBuilder sb = new StringBuilder();
        int n = 1;
        int index = 0;
        
        // A ~ Z까지 Map에 입력
        for (char c = 'A'; c <= 'Z'; c++, n++) {
            map.put(String.valueOf(c), n);
        }
        
        while (index < msg.length()) {
            String w = "";
            
            while (index < msg.length()
                   && map.containsKey(w + msg.charAt(index))) {
                w += msg.charAt(index);
                index++;
            }
            
            if (index < msg.length()) {
                map.put(w + msg.charAt(index), n++);    
            }
            list.add(map.get(w));
        }
        
        // List를 정수 배열로 변경
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}