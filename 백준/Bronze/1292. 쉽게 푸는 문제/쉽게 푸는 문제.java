import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                numbers.add(i);
            }
        }

        Scanner sc = new Scanner(System.in);
        int root = sc.nextInt();
        int tail = sc.nextInt();
        int sum = 0;

        for (int i = root; i < tail + 1; i++) {
            sum += numbers.get(i);
        }

        System.out.print(sum);
    }

}
