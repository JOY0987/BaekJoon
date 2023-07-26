import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String str;

        while ((str = br.readLine()) != null) {
            long num = 0;
            int digits = 1;
            while (true) {
                n = Integer.parseInt(str);
                num = num * 10 + 1; // 11, 111, 1111, 11111 ...
                if ((num %= n) == 0) {
                    System.out.println(digits);
                    break;
                }
                digits++;
            }
        }
    }
}
