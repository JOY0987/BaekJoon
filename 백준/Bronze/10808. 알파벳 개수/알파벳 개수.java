import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        String str = sc.nextLine().toLowerCase();
        for (int i = 97; i < 123; i++) {
            int num = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == (char) i) num++;
            }
            System.out.printf("%d ", num);
        }
    }
}