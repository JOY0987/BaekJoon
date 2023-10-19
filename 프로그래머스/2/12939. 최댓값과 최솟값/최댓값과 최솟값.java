import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] numbers = s.split(" ");
        
        for (String ns : numbers) {
            int n = Integer.parseInt(ns);
            if (n > max) max = n;
            if (n < min) min = n;
        }
        
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return sb.toString();
    }
}