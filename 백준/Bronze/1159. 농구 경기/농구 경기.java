import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            String str = br.readLine().toLowerCase();
            arr[str.charAt(0) - 'a']++;
        }

        String result = "";

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                result += String.valueOf((char)('a' + i));
            }
        }

        if (result.equals("")) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(result);
        }

    }
}
