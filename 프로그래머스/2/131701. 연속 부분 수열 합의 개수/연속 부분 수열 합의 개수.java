import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        int[] nums = new int[len * 2];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = elements[i % len];
        }
        
        Set<Integer> set = new HashSet<>();
        // 7 9 1 1 4 7 9 1 1 4
        
        int start = 0;
        while (++start <= len) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = i; j < i + start; j++) {
                    sum += nums[j];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}