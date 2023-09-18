class Solution {
    public int[] solution(String[] wallpaper) {
        
        int x = wallpaper[0].length(); // 전체 가로 길이
        int y = wallpaper.length; // 전체 세로 길이
        
        int leftY = x, topX = y, rightY = 0, bottomX = 0;
       
        for(int i = 0; i < y; i++) { // 2
            for(int j = 0; j < x; j++) {
                char current = wallpaper[i].charAt(j);
                
                if (current == '#') {
                    topX = Math.min(topX, i);
                    bottomX = Math.max(bottomX, i);
                    leftY = Math.min(leftY, j);
                    rightY = Math.max(rightY, j);
                }
            }
        }
        
        int[] answer = {topX, leftY, bottomX + 1, rightY + 1};
        return answer;
    }
}