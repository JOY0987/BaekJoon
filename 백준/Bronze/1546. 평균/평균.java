import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjectNum = sc.nextInt();
        double highScore = 0;
        double average = 0;
        double[] scores = new double[subjectNum];

        // 현재 성적 입력, 최대값 선정
        for (int i = 0; i < subjectNum; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > highScore) highScore = scores[i];
        }

        // 모든 점수 고치기
        for (int i = 0; i < subjectNum; i++) {
            scores[i] = scores[i] / highScore * 100;
            average += scores[i];
        }

        // 새로운 평균 출력
        System.out.print(average / subjectNum);

        sc.close();

    }
}
