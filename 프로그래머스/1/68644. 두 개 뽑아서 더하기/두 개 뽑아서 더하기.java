import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> list = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                list.add(sum);
            }
        }
        
        int[] answer = new int[list.size()];
        ArrayList<Integer> arrList = new ArrayList<>(list);
        Collections.sort(arrList);
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}