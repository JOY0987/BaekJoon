import java.util.*;

class Solution
{
    public int solution(String s)
    {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.add(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}