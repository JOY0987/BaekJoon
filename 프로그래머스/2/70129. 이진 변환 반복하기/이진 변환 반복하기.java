class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int binaryCnt = 0;
        
        // 이진 변환
        while (s.length() > 1) {
            int oneCnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    oneCnt++;
                } else {
                    answer[1]++;       
                }
            }
            s = Integer.toBinaryString(oneCnt);
            binaryCnt++;
        }
        
        answer[0] = binaryCnt;
        
        return answer;
    }
}