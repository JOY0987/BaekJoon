class Solution {
    int[] numbers;
    
    int target;
    
    int answer;
    
    void dfs(int index, int sum) {
        // index 0, sum 0부터 시작
        // 탈출 조건
        if (index == numbers.length) { // 배열을 다 돌았고
            if (sum == target) answer++; // 합계가 target과 같을 경우 경우의수 +1
            return;
        }
        
        // 실행부
        // index 요소를 더한 경우와 뺀 경우로 다음 요소 재귀 호출
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        this.answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
    
        return answer;
    }
}