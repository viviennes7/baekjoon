package BOJ_20171213;

import java.util.Scanner;

public class BOJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int score = 0;
        char[] chars = null;
        int sum = 0;

        for(int i = 0; i < count; i++){
            String command = sc.next();
            chars = command.toCharArray();

            for(int j = 0; j < chars.length; j++){
                if(chars[j] == 'X'){
                    score = 0;
                }else{
                    score++;
                    sum += score;
                }
            }
            System.out.println(sum);
            score = 0;
            sum = 0;
        }
    }
}
