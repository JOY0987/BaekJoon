import java.util.*;

class Solution {
    
    private int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                int temp = 0;
                int next = j + 1;
                if (arr[j] > arr[next]) {
                    temp = arr[j];
                    arr[j] = arr[next];
                    arr[next] = temp;
                }
            }
        }
        
        return arr;
    }
    
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        answer = sort(answer);
        
        return answer;
    }
}