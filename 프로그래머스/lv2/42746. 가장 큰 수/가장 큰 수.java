import java.util.*;

class Solution {
    // 버블 정렬로 풀어보기
    
    public String solution(int[] numbers) {
        
        String answer = "";
        String[] numberArray = new String[numbers.length];
        int j = 0;
        
        for(int n : numbers) {
            numberArray[j] = String.valueOf(n);
            j++;
        }
        
        // 정렬
        // o2 + o1 이 o1 + o2 보다 크다면 양수를 반환해서 다음 요소(o2)와 현재 요소(o1)의 위치를 바꿔준다.
        Arrays.sort(numberArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        for (int i = 0; i < numberArray.length; i++) {
            answer += numberArray[i];
        }
            
        if (answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}