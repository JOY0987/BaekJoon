class Solution {
    public String solution(int a, int b) {
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int now = 0;

        for (int i = 0; i < a - 1; i++) { // 지정달의 이전달까지만 더해야하므로 -1
            now += days[i];
        }
        
        now += b - 1; // 1월 1일부터 시작이므로 -1
        
        return dayOfWeek[now % 7];
    }
}