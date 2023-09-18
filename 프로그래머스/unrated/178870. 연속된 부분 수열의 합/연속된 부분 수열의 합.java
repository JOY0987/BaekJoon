class Solution {
    public int[] solution(int[] sequence, int k) {

        int n = sequence.length;
        int left = 0, right = sequence.length, sum = 0;
        
        // index 0 에서 부터 k 합이 만들어지는 최초의 수열을 찾고 
        // L 오른쪽으로 한칸씩 이동하며 k 합이 만들어지는 경우에서 범위가 가장 작은 걸 찾기
        for(int L = 0, R = 0; L < n; L++) {
            while(R < n && sum < k) {
                sum += sequence[R++];
            }
            
            if (sum == k) {
                if (R - L - 1 < right - left - 1) {
                    right = R;
                    left = L;
                }
            }
            
            sum -= sequence[L];
        }
            
            
        return new int[] {left, right - 1};
    }
}