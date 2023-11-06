class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String temp = "";
        
        while (n != 0) {
            temp = n % k + temp;    
            n /= k;
        }
        
        for (String num : temp.split("0")) {
            if (num.equals("")) continue;
            if (isPrime(Long.parseLong(num))) answer++;
        }
        
        return answer;
    }
    
    private boolean isPrime(long n) {
        if (n == 1) return false;
        if (n == 2) return true;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}