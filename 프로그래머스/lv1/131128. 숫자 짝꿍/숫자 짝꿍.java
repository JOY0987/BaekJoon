import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        // 0부터 9까지 몇개 가지고 있는지 셋팅
        int[] intX = new int[10];
        int[] intY = new int[10];
        
        for(char c : X.toCharArray()) {
            int num = c - '0';
            intX[num]++;
        }
        
        for(char c : Y.toCharArray()) {
            int num = c - '0';
            intY[num]++;
        }
        
        // 두 배열 비교해서 짝꿍 숫자만 찾아내기
        int[] intXY = new int[10];
        for(int i = 0; i < 10; i++) {
            if (intX[i] > 0 && intY[i] > 0) {
                if (intX[i] >= intY[i]) intXY[i] = intY[i];
                else intXY[i] = intX[i];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        for(int i = 0; i < 10; i++) {
            cnt += intXY[i];
            if (intXY[i] != 0) {
                for (int j = 0; j < intXY[i]; j++) {
                    sb.append(i);
                }
            }
        }
        
        answer = sb.reverse().toString();
        
        // 0밖에 없으면
        if (cnt == intXY[0]) answer = "0";
        
        return cnt == 0 ? "-1" : answer;
    }
}