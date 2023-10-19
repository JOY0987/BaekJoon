import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        
        for (int n : A) {
            aList.add(n);
        }
        for (int n : B) {
            bList.add(n);
        }
        
        aList.sort(Comparator.naturalOrder());
        bList.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < A.length; i++) {
            answer += aList.get(i) * bList.get(i);
        }
            
        return answer;
    }
}