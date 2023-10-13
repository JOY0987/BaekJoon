import java.util.*;

class Solution {
    
    class Position {
        int row;
        int col;
        
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
        
        public String getFinger(Position left, Position right, String hand) {
            String finger = hand.equals("right") ? "R" : "L";
            
            if (this.col == 0) finger = "L";
            else if (this.col == 2) finger = "R";
            else {
                int leftDist = left.getDistance(this);
                int rightDist = right.getDistance(this);
                
                if (leftDist < rightDist) finger = "L";
                else if (rightDist < leftDist) finger = "R";
            }
            
            return finger;
        }
        
        public int getDistance(Position p) {
            return Math.abs(this.row - p.row) + Math.abs(this.col - p.col);
        }
    }
    
    public String solution(int[] numbers, String hand) {
        StringBuffer answer = new StringBuffer();
        
        // 왼손, 오른쪽 위치를 초기화
        Position left = new Position(3, 0);
        Position right = new Position(3, 2);
        
        // 숫자를 누를 손가락 정하기
        for (int num : numbers) {
            Position numPos = new Position((num - 1) / 3, (num - 1) % 3);
            if (num == 0) {
                numPos = new Position(3, 1);
            }
            String finger = numPos.getFinger(left, right, hand);
            
            // 정해진 손가락을 answer 에 담고 손가락 위치 이동
            answer.append(finger);
            if (finger.equals("L")) {
                left = numPos;
            } else {
                right = numPos;
            }
        }        
        
        return answer.toString();
    }
    
}