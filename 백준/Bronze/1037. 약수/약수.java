import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfMeasures = Integer.parseInt(br.readLine());
        String inputMeasures = br.readLine();
        String[] stringMeasures = inputMeasures.split(" ");
        int[] measures = new int[stringMeasures.length];

        for (int i = 0; i < measures.length; i++) {
            measures[i] = Integer.parseInt(stringMeasures[i]);
        }

        int minMeasure = Arrays.stream(measures).min().getAsInt();
        int maxMeasure = Arrays.stream(measures).max().getAsInt();

        System.out.print(minMeasure * maxMeasure);
    }
}
