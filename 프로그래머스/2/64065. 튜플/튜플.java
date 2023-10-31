import java.util.*;

class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        s = s.substring(2, s.length() - 2);
        
        String[] tuples = s.split("\\},\\{");
        
        Arrays.sort(tuples, (o1, o2) -> o1.length() - o2.length());

        List<Integer> list = new LinkedList<>();
        
        list.add(Integer.parseInt(tuples[0]));
        
        for (int i = 1; i < tuples.length; i++) {
            String[] numbers = tuples[i].split(",");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}