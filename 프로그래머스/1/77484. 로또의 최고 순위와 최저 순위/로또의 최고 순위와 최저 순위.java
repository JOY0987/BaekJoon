class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};
        int zeroCnt = 0;
        // List<Integer> winList = new ArrayList<>();

        // for (int i : win_nums) {
        //     winList.add(i);
        // }
        
        for (int i : lottos) {
            if (i == 0) {
                answer[0]--;
            } else {
                for (int j : win_nums) {
                    if (i == j) {
                        answer[0]--;
                        answer[1]--;
                    }
                }
            }
        }
        
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 7) answer[i] = 6;
        }
        
        return answer;
    }
}