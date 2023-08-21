import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());// 명령의 수
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            switch (order) {
                case 1:
                    stack.push(Integer.valueOf(st.nextToken()));
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.peek());
                        stack.pop();
                    }
                    sb.append("\n");
                    break;
                case 3:
                    sb.append(stack.size())
                            .append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0)
                            .append("\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek())
                            .append("\n");
                    break;
            }
        }

        System.out.print(sb);

    }

}
