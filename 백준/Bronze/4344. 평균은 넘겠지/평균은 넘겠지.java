import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < testcase; i++) {
            // 점수
            double sum = 0;
            int[] scores;

            // 학생수 입력
            int stuNum = sc.nextInt();
            scores = new int[stuNum];

            // 학생들의 점수 입력
            for (int j = 0; j < stuNum; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            // 평균 계산
            double average = sum / scores.length;

            // 평균 넘는 학생들은 몇명인가?
            double averageStudent = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > average) averageStudent++;
            }

            System.out.printf("%.3f%%\n", averageStudent / scores.length * 100);
        }

        sc.close();

    }
}
