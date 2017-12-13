package BOJ_20171213;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int result = 0;
        int number = 0;

        for(int i = 0; i < count; i++){
            number = sc.nextInt();
            boolean isPrime = false;

            if(number == 2) {
                result++;
                continue;
            }
            for(int j = 2; j < number; j++) {
                if(number % j == 0){
                    isPrime = false;
                    break;
                }else{
                    isPrime = true;
                }
            }
            if(isPrime) result ++;
        }

        System.out.print(result);
    }
}
