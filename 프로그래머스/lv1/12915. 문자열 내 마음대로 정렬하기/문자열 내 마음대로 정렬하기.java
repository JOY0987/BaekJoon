import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        for(int i = 1; i < strings.length; i++) {
            for(int j = 0; j < strings.length - i; j++) {
                Arrays.sort(strings, new Comparator<String>() {
                    // 정렬 기준 재정의
                    @Override
                    public int compare(String s1, String s2) {
                        char c1 = s1.charAt(n);
                        char c2 = s2.charAt(n);
                        
                        if (c1 != c2) {
                            return c1 - c2;
                        } else {
                            return s1.compareTo(s2);
                        }
                    }
                });
            }
        }
        
        return strings;
    }
}