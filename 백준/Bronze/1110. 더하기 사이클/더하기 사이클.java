import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;

        for (int i = 1; i != 0; i++) {
            b = (b % 10 * 10) + (b / 10 + b % 10) % 10;
            if (a == b) {
                System.out.print(i);
                break;
            }
        }

    }
}
