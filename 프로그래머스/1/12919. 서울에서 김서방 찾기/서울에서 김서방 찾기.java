class Solution {
    public String solution(String[] seoul) {
        int location;
        
        for (location = 0; location < seoul.length; location++) {
            if (seoul[location].equals("Kim")) {
                break;
            }
        }
        
        return "김서방은 " + location + "에 있다";
    }
}