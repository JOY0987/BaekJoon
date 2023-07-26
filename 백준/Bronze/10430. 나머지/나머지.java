import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNumbers = null;
        int A = 0;
        int B = 0;
        int C = 0;

        try {
            inputNumbers = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] numbers = inputNumbers.split(" ");

        try {
            A = Integer.parseInt(numbers[0]);
            B = Integer.parseInt(numbers[1]);
            C = Integer.parseInt(numbers[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        System.out.println(( A + B ) % C);
        System.out.println((( A % C ) + ( B % C )) % C);
        System.out.println(( A * B ) % C );
        System.out.print((( A % C ) * ( B % C )) % C );
    }
}