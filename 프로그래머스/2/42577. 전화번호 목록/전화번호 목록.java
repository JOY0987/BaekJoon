import java.util.*;

class Solution {
    
    public boolean solution(String[] phone_book) {
        
        Set<String> phones = new HashSet<>();
        Set<Integer> lengths = new TreeSet<>(); // 오름차순
        
        for (String phone : phone_book) {
            phones.add(phone);
            lengths.add(phone.length());
        }
        
        for (String phone : phone_book) {
            for (int i : lengths) {
                if (i >= phone.length()) {
                    break;
                }
                
                if (phones.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}