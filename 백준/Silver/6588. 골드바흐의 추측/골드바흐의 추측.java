import java.io.*;

public class Main {
    public static int MAX = 1000000;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] numbers = new boolean[1000001];
        // 소수를 제외하고 모두 true 로 변경
        // 짝수는 어차피 소수가 아니니까 +2씩
        for (int i = 2; i <= Math.sqrt(numbers.length); i++) {
            // i 의 배수 지우기
            for (int j = i + i; j < numbers.length; j += i) {
                numbers[j] = true;
            }
        }

        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            boolean ok = false;

            for (int i = 3; i <= n / 2; i += 2) {
                if (!numbers[i] && !numbers[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    ok = true;
                    break;
                }
            }

            if (!ok) System.out.println("Goldbach's conjecture is wrong.");
            n = Integer.parseInt(br.readLine());
        }
    }
}
