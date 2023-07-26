import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sumOfMeasures = 0;

        // n 이하의 정수 중 i 를 약수로 갖는 수의 갯수를 구하기
        for (int i = 1; i <= n; i++) {
            sumOfMeasures += (long) n / i * i;
        }

        System.out.print(sumOfMeasures);

    }
}
