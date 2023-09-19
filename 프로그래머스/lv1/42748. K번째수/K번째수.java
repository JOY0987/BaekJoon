import java.util.*;

class Solution {
    
    public static int[] sort(int[] array, int start, int end) {
        int[] sortedArray = Arrays.copyOfRange(array, start, end);
        // 요소 한 개씩 삽입 정렬
        for (int i = 1; i < sortedArray.length; i++) {
            int target = sortedArray[i]; // 정렬 타겟 요소
            int j = i - 1; // 비교할 이전 요소
            // 타겟 요소가 비교 요소보다 작으면 이전 요소를 뒤로 한칸 민다.
            while(j >= 0 && target < sortedArray[j]) {
                sortedArray[j + 1] = sortedArray[j];
                --j;
            }
            // 타겟 요소가 이전 요소보다 크면 타겟 요소를 이전 요소 뒤에 삽입
            sortedArray[j + 1] = target;
        }
        
        return sortedArray;
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int start = 0;
        int end = 0;
        int k = 0;
        int num = 0;
        
        for(int i = 0, j = 0; i < commands.length; i++) {
            start = commands[i][j] - 1;
            end = commands[i][j + 1];
            k = commands[i][j + 2];
            
            // 정렬
            int[] sortedArray = sort(array, start, end);

            // k번째 수?
            num = sortedArray[k - 1];
            answer[i] = num;
        }
        
        return answer;
    }
}