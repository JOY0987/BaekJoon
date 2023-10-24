import java.util.*;

class Solution {
    public int solution(int[] arr) {
        // 최소공배수 = a * b / 최대공약수
        Arrays.sort(arr);
        int answer = arr[arr.length - 1];
        boolean flag = false;
        
        while (true) {
            flag = false;
            
            for (int i = 0; i < arr.length - 1; i++) {
                if (answer % arr[i] != 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                return answer;
            }
            
            answer += arr[arr.length - 1];
        }
    }
}