class Solution {
    public int solution(int num) {
        int count = 0;
        long n = Long.valueOf(num);

        while(count < 500 && n != 1) {
            if (n % 2 == 0) n = n / 2;
            else n = n * 3 + 1;
            count++;
        }
        
        return count == 500 ? -1 : count;
    }
}