import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int realDecimalNumber = 0;
        String inputDecimals = br.readLine();
        String[] strDecimals = inputDecimals.split(" ");
        List<Integer> decimals = new ArrayList<>();

        for (String strDecimal : strDecimals) {
            decimals.add(Integer.valueOf(strDecimal));
        }

        for (int decimal : decimals) {
            int decimalNumber = 0;
            for (int i = 1; i <= decimal; i++) {
                if (decimal % i == 0) {
                    decimalNumber++;
                }
            }
            if (decimalNumber == 2) {
                realDecimalNumber++;
            }
        }

        System.out.print(realDecimalNumber);

    }
}
