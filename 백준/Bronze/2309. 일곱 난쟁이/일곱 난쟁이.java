import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] numbers = new int[9];
        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (sum - numbers[i] - numbers[j] == 100) {
                    x = numbers[i];
                    y = numbers[j];
                }
            }
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x || numbers[i] == y) {
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
