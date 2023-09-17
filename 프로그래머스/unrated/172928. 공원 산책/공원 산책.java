class Solution {
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
            
        // 시작지점
        int x = 0, y = 0;
        
        // 공원 이차원배열 생성
        char[][] parkArr = new char[park.length][park[0].length()];
        
        for(int i=0; i<parkArr.length; i++) {
            parkArr[i] = park[i].toCharArray();
            // 시작지점 설정
            if (park[i].contains("S")) {
                x = park[i].indexOf("S");
                y = i;
            }
        }
        
       
        // 루트 순회하며 조건 검사 및 이동        
        for(String route : routes) {
            
            String direction = route.split(" ")[0];
            int len = Integer.parseInt(route.split(" ")[1]);
            
            int nx = x, ny = y;
            
            for(int i=0; i<len; i++) {
                if (direction.equals("E")) {
                    nx++;
                }
                if (direction.equals("W")) {
                    nx--;
                }
                if (direction.equals("N")) {
                    ny--;
                }
                if (direction.equals("S")) {
                    ny++;
                }
                // 좌표가 범위 내에 있는가?
                if (nx >= 0 
                    && ny >= 0 
                    && nx < parkArr[0].length
                    && ny < parkArr.length) {
                    // 한칸 이동한 곳이 X면 아예 종료하고 다음 루트로
                    if (parkArr[ny][nx] == 'X') {
                        break;
                    }
                    // 마지막 루프 시 진짜 좌표 바꿔주기
                    if (i == len-1) {
                        x = nx;
                        y = ny;    
                    }
                }
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}