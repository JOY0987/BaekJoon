import java.util.*;

class Solution {
    
    StringBuilder sb;
    Map<Character, Integer> typeMap;
        
    public String solution(String[] survey, int[] choices) {
        
        String type = "RTCFJMAN";
        sb = new StringBuilder();
        typeMap = new HashMap<>();
        
        for (char c : type.toCharArray()) {
            typeMap.put(c, 0);
        }

        for (int i = 0; i < choices.length; i++) {
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            int score = choices[i];
            
            if (score == 4) continue;
            
            if (score < 4) {
                score = 4 - score;
                typeMap.put(type1, typeMap.get(type1) + score);
            } else {
                score = score - 4;
                typeMap.put(type2, typeMap.get(type2) + score);
            }
        }
        
        sb = new StringBuilder();
        
        appendType('R', 'T');
        appendType('C', 'F');
        appendType('J', 'M');
        appendType('A', 'N');
        
        return sb.toString();
    }
    
    private void appendType(char t1, char t2) {
        if (typeMap.get(t1) >= typeMap.get(t2)) sb.append(String.valueOf(t1));
        else sb.append(String.valueOf(t2));
    }
}