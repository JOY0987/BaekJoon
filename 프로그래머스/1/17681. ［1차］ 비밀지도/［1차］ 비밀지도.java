import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            if (s1.length() < n) {
                for (int j = 0; j < n - s1.length(); j++) {
                    sb.append("0");
                }
                s1 = sb + s1;
                sb.setLength(0);
            }
            if (s2.length() < n) {
                for (int j = 0; j < n - s2.length(); j++) {
                    sb.append("0");
                }
                s2 = sb + s2;
                sb.setLength(0);
            }
            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}