class Solution {
    public String solution(int[] food) {
        String answer = "";
        String temp = "";
        
        for(int i = 1; i < food.length; i++) {
            int foodNumToOne = food[i] / 2;
            for(int j = 0; j < foodNumToOne; j++) {
                temp += String.valueOf(i);
            }
        }
        
        temp += "0";
        answer += temp;

        for(int i = temp.length() - 2; i >= 0; i--) {
            answer += temp.charAt(i);
        }
        
        return answer;
    }
}