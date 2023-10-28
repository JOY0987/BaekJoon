import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        int len = s.length();
        int x = -1;
        while (++x < len) {
            for (int i = x; i < len + x; i++) {
                char c = s.charAt(i % len);
                if (!stack.isEmpty()) {
                    if ((c == ']' && stack.peek() == '[')
                        || (c == ')' && stack.peek() == '(')
                        || (c == '}' && stack.peek() == '{')
                    ) {
                       stack.pop(); 
                    } else {
                        stack.add(c);
                    }
                } else {
                    stack.add(c);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
            stack.clear();
        }
        
        return answer;
    }
}