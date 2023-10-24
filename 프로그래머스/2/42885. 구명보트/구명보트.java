import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int max = people.length - 1;
        int min = 0;
        
        Arrays.sort(people);
        
        while (max >= min) {
            if (people[max] + people[min] <= limit) {
                min++;
            }
            max--;
            answer++;
        }
        
        return answer;
    }
    
}