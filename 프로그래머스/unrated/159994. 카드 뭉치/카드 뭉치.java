import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for(String s : cards1) {
            q1.add(s);
        }
        
        for(String s : cards2) {
            q2.add(s);
        }
        
        for (int i = 0; i < goal.length; i++) {
            if (!q1.isEmpty() && q1.peek().equals(goal[i])) {
                q1.poll();
                continue;
            }
            if (!q2.isEmpty() && q2.peek().equals(goal[i])) {
                q2.poll();
                continue;
            }
            answer = "No";
            break;
        }
        
        return answer;
    }
}