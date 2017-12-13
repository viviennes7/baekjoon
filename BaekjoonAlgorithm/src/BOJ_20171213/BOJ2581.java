package BOJ_20171213;

import java.util.Scanner;

public class BOJ2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int min = 0;

        for(int i = n; i <= m; i++){
            if(isPrime(i)){
                if(min == 0){
                    min = i;
                }
                sum += i;
            }
        }

        if(min == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isPrime(int number){
        if(number == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
