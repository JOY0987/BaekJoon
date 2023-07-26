import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, min = 0, num = 0;
        String str = br.readLine();
        String[] strings = str.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);

        if (a < b) {
            num = a;
        } else {
            num = b;
        }

        for (int i = num; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                max = i;
                break;
            }
        }
        min = max * (a / max) * (b / max);
        System.out.println(max);
        System.out.print(min);
    }
}
