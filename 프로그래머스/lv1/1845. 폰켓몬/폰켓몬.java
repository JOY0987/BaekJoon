import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums) {
            set.add(n);
        }
        
        int getNum = nums.length / 2;
        
        if (set.size() > getNum) {
            answer = getNum;
        } else {
            answer = set.size();
        }        
        
        return answer;
    }
}