import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        while(n != 0) {
            list.add(n % 3);
            n /= 3;
        }
        
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}