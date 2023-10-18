import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] result = new int[id_list.length];
        Map<String, Integer> userIdxs = new HashMap<>();
        Map<String, ArrayList<String>> reportHistory = new HashMap<String, ArrayList<String>>(); // K 피신고자 V 신고자들
        Map<String, Integer> reportMap = new HashMap<>(); // 신고횟수
        StringBuilder endUser = new StringBuilder(); // 정지 회원 목록
        int i = 0;
        
        for (String user : id_list) {
            userIdxs.put(user, i++);
            reportHistory.put(user, new ArrayList<>());
            reportMap.put(user, 0);
        }
        
        for (String r : report) {
            String[] s = r.split(" ");
            String reporter = s[0];
            String reported = s[1];
            ArrayList<String> reporters = reportHistory.get(reported);
            
            // 과거 신고 내역이 있는 경우 추가 X
            if (reporters.contains(reporter)) continue;
            
            // 신고 내역에 추가
            reporters.add(reporter);
            reportHistory.put(reported, reporters);
            
            // 누적신고횟수 추가
            reportMap.put(reported, reportMap.get(reported) + 1);
            
            
        }
        
        for (String reported : reportMap.keySet()) {
            // 누적신고가 k번인 경우 정지 + 신고자들에게 메일 보내기
            if (reportMap.get(reported) >= k) {
                ArrayList<String> finalReporters = reportHistory.get(reported);
                
                for (String reportUser : finalReporters) {
                    int idx = userIdxs.get(reportUser);
                    result[idx]++;
                }
                
                reportHistory.put(reported, finalReporters);
            }
        }
        
        return result;
    }
}