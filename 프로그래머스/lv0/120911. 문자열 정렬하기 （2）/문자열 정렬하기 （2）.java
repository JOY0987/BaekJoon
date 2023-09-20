import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        char[] strings = my_string
            .toLowerCase()
            .toCharArray();
        Arrays.sort(strings);
        
        my_string = String.valueOf(strings);
        
        
        return my_string;
    }
}