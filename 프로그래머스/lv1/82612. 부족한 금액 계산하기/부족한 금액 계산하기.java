class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        while(count != 0) {
            answer += price * count;
            count--;
        }

        return answer - money > 0L ? answer - money : 0L;
    }
}