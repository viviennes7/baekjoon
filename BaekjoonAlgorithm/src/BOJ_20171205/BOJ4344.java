package BOJ_20171205;

import java.util.Scanner;

public class BOJ4344 {
    public static void main(String[] args){
        final String per = "%";
        final Scanner scanner = new Scanner(System.in);
        final int totalCount = scanner.nextInt();

        for(int i = 0; i < totalCount; i++){
            double count = scanner.nextInt();
            int[] scores = new int[(int)count];
            int sum = 0;

            for(int j = 0; j < count; j++){
                int score = scanner.nextInt();
                scores[j] = score;
                sum += score;
            }

            double avg = sum / count;
            double success = 0;

            for(int score : scores){
                if (avg < score) {
                    success += 1;
                }
            }
            double result = success * 100 / count;
            System.out.println(String.format("%.3f", result) + per);
        }
    }
}
