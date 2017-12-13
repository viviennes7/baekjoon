package BOJ_20171213;

import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] alphas = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int result = 0 ;

        for(String s : alphas) {
            word = word.replace(s, "a");
        }

        System.out.println(word.length());
    }
}
