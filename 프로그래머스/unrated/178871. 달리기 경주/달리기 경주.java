import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String, Integer> mappedByPlayer = new HashMap<>();
        HashMap<Integer, String> mappedByRank = new HashMap<>();
        
        // HashMap 초기화
        for(int i = 0; i < players.length; i++) {
            mappedByRank.put(i, players[i]);
            mappedByPlayer.put(players[i], i);
        }
        
        // callings 순회
        for(int i = 0; i < callings.length; i++) {
            int currentRank = mappedByPlayer.get(callings[i]);
            String prevPlayer = mappedByRank.get(currentRank - 1);
            mappedByRank.put(currentRank, prevPlayer);
            mappedByRank.put(currentRank - 1, callings[i]);
            mappedByPlayer.put(prevPlayer, currentRank);
            mappedByPlayer.put(callings[i], currentRank - 1);
        }
        
        // 결과 정리
        for(int i = 0; i < players.length; i++) {
            answer[i] = mappedByRank.get(i);
        }
        
        return answer;
    }
}