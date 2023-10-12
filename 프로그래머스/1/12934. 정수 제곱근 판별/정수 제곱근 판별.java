import java.util.*;

class Solution {
    public long solution(long n) {
        double x = Math.ceil(Math.sqrt(n));
        if ((long) (x * x) == n) {
            return (long) ((x + 1) * (x + 1));
        } else {
            return -1;
        }
    }
}