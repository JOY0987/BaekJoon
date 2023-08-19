import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 명령의 수
        StringBuilder sb = new StringBuilder();
        StringTokenizer input;

        for (int i = 0; i < n; i++) {
            input = new StringTokenizer(br.readLine()); // 띄어쓰기 기준으로 문자열 분리
            int order = Integer.parseInt(input.nextToken());

            // 1 ~ 9
            if (order == 1) {
                dq.addFirst(Integer.valueOf(input.nextToken()));
            }
            if (order == 2) {
                dq.addLast(Integer.valueOf(input.nextToken()));
            }
            if (order == 3) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            }
            if (order == 4) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            }
            if (order == 5) {
                sb.append(dq.size()).append("\n");
            }
            if (order == 6) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            }
            if (order == 7) {
                sb.append(dq.isEmpty() ? -1 : dq.getFirst()).append("\n");
            }
            if (order == 8) {
                sb.append(dq.isEmpty() ? -1 : dq.getLast()).append("\n");
            }
        }

        System.out.print(sb);

    }

}
