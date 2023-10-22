import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
       List<String> prevList = new ArrayList<>();
        int i = 0;
        prevList.add(words[0]);
        
        for (i = 1; i < words.length; i++) {
            String word = words[i];
            char lastChar = words[i - 1].charAt(words[i - 1].length() - 1);
            
            if (!prevList.contains(word)
               && word.charAt(0) == lastChar) {
                prevList.add(word);
            } else {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}