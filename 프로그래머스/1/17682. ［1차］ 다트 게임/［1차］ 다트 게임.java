import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int len = dartResult.length();
        char[] result = dartResult.toCharArray();
        List<Integer> scores = new ArrayList<>();
        int i = -1;
        int ln = 0;

        while (++i < len) {
            char c = result[i];
            char next = result[i + 1];
            double score = 0;
            
            // 숫자이면 +
            // 만약 다음 문자도 숫자이면 이번 판은 10점
            if (0 <= next - '0' && 10 >= next - '0') {
                score = 10;
                i++;
            } else {
                score = c - '0';
            }

            // 영문자 제곱 계산
            char area = result[++i];

            if (area == 'S') {
                score = Math.pow(score, 1);
            } else if (area == 'D') {
                score = Math.pow(score, 2);
            } else if (area == 'T') {
                score = Math.pow(score, 3);
            }
            
            // 영문자 다음에 상이 있는가?
            if (++i < len) {
                char option = result[i];
                if (option == '*') {
                    score *= 2;
                    if (ln > 0) {
                        scores.set(ln - 1, scores.get(ln - 1) * 2);
                    }
                } else if (option == '#') {
                    score *= -1;
                } else { // 상이 없는 경우
                    i--;
                }
            }
            
            scores.add((int) score);
            ln++;
        }
        
        for (int j = 0; j < scores.size(); j++) {
            answer += scores.get(j);
        }
        
        return answer;
    }
}