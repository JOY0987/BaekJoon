import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        Map<String, Integer> AMap = new HashMap<>();
        Map<String, Integer> BMap = new HashMap<>();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            if (!Character.isAlphabetic(str1.charAt(i))
                || !Character.isAlphabetic(str1.charAt(i + 1))) {
                    continue;
                }
            String s = String.valueOf(str1.charAt(i)) + str1.charAt(i + 1);
            AMap.put(s, AMap.getOrDefault(s, 0) + 1);
            System.out.println(s);
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            if (!Character.isAlphabetic(str2.charAt(i))
                || !Character.isAlphabetic(str2.charAt(i + 1))) {
                    continue;
                }
            String s = String.valueOf(str2.charAt(i)) + str2.charAt(i + 1);
            BMap.put(s, BMap.getOrDefault(s, 0) + 1);
            System.out.println("2 : " + s);
        }
        
        double union = 0;
        double intersection = 0;
        
        for (String key : AMap.keySet()) {
            if (BMap.containsKey(key)) {
                union += Math.max(AMap.get(key), BMap.get(key));
                intersection += Math.min(AMap.get(key), BMap.get(key));
                BMap.remove(key);
            } else {
                union += AMap.get(key);
            }
        }
        
        for (String key : BMap.keySet()) {
            union += BMap.get(key);
        }
        
        if (union == 0) {
            return 65536;
        }
        
        return (int) (intersection / union * 65536);
    }
}