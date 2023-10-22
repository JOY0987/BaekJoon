class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int i = 2; i < brown; i += 2) {
            int row = (brown - i) / 2;
            int col = i / 2 + 2;
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = row;
                answer[1] = col;
                break;
            }
        }
        
        return answer;
    }
}