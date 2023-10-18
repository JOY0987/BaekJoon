import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // Map 에 terms 를 K 약관 - V 유효기간(일) 형태로 넣는다
        HashMap<String, Integer> dateMap = new HashMap<>();
        
        for (String t : terms) {
            String[] term = t.split(" ");
            String privacy = term[0];
            int period = Integer.parseInt(term[1]) * 28; // 월 -> 일 변환
            dateMap.put(privacy, period);
        }
        
        // privacies 를 돌면서 수집된 날짜로부터 오늘까지 몇일이 지났는 지 계산한다
        int todayDate = getDate(today);
        int i = 0;
        
        for (String p : privacies) {
            String[] privacyArr = p.split(" ");
            int date = getDate(privacyArr[0]);
            String privacy = privacyArr[1];
            // 계산한 날짜가 유효기간을 초과한 경우 배열의 인덱스+1 번호를 answer에 넣는다
            if (todayDate - date >= dateMap.get(privacy)) {
                answer.add(i + 1);
            }
            i++;
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private int getDate(String d) {
        String[] dates = d.split("\\.");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int date = Integer.parseInt(dates[2]);
        
        // 총 일자로 계산해서 리턴
        return (year * 12 * 28) + (month * 28) + date;
    }
}