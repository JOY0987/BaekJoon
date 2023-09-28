import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] student = new int[3];
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if (first[i % first.length] == ans) student[0]++;
            if (second[i % second.length] == ans) student[1]++;
            if (third[i % third.length] == ans) student[2]++;
        }
        
        int max = Math.max(student[0], Math.max(student[1], student[2]));
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < student.length; i++) {
            if (student[i] == max) list.add(i + 1);
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}