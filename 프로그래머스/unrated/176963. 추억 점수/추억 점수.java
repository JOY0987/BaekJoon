import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> mappedByName = new HashMap<>();
        
        // HashMap 초기화
        for(int i=0; i<name.length; i++) {
            mappedByName.put(name[i], yearning[i]);
        }
        
        // 사진을 순회하며 점수 부여
        for(int i=0; i<photo.length; i++) {
            for(int j=0; j<photo[i].length; j++) {
                if (mappedByName.containsKey(photo[i][j])) answer[i] += mappedByName.get(photo[i][j]);
            }
        }
        
        return answer;
    }
}