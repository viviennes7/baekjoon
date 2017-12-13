package BOJ_20171213;

import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        char[] chars = command.replaceAll(" ","").toCharArray();
        String result = "";
        int minus = 0;

        for(int i = 1; i < chars.length; i++){
            minus = chars[i - 1] - chars[i];
            if(minus > 1 || minus < -1){
                result = "mixed";
                break;
            }
        }

        if(minus == 1){
            result = "descending";
        }else if(minus == -1){
            result = "ascending";
        }

        System.out.println(result);
    }
}
