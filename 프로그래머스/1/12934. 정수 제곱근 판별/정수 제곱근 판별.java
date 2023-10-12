import java.util.*;

class Solution {
    public long solution(long n) {
        Double x = Math.sqrt(n);
        
        if (x == x.intValue()) {
            return (long) ((x + 1) * (x + 1));
        } else {
            return -1;
        }
    }
}