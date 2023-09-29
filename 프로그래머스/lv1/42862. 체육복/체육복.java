import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // key = 여벌 체육복 가진 학생 번호, value = 대여 가능 여부
        HashMap<Integer, Boolean> hasReserved = new HashMap<>();
        List<Integer> losts = new ArrayList<>();
        
        for (int num : reserve) {
            hasReserved.put(num, true);
        }
        
        for (int lostStudent : lost) {
            if (hasReserved.getOrDefault(lostStudent, false)) {
                hasReserved.put(lostStudent, false);
            } else {
                losts.add(lostStudent);
            }
        }   
        
        answer -= losts.size();
        
        for (int lostStudent : losts) {
            int prev = lostStudent - 1;
            int next = lostStudent + 1;
            
            if (prev > 0 && hasReserved.getOrDefault(prev, false)) {
                hasReserved.put(prev, false);
                answer++;
            } else if (next <= n && hasReserved.getOrDefault(next, false)) {
                hasReserved.put(next, false);
                answer++;
            }
        }   

        return answer;
    }
}