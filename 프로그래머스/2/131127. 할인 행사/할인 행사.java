import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> buyGoods;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            buyGoods = new HashMap<>();
            boolean flag = false;
            
            for (int j = i; j < 10 + i; j++) {
                buyGoods.put(discount[j], buyGoods.getOrDefault(discount[j], 0) + 1);
            }
            
            for (int k = 0; k < want.length; k++) {
                if (buyGoods.getOrDefault(want[k], 0) == number[k]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            
            if (flag) answer++;
        }
        
        return answer;
    }
}