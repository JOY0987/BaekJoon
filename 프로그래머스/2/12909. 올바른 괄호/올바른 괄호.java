import java.util.*;

class Solution {
    boolean solution(String s) {
        
        if (s.length() % 2 != 0) return false;

        Queue<Character> queue = new LinkedList<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                queue.offer(c);
            } else {
                queue.poll();
            }
        }
        
        return queue.isEmpty() ? true : false;
    }
}