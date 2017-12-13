package BOJ_20171213;

import java.util.Scanner;

public class BOJ1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int result = count;
        char[] chars = null;
        boolean[] words = null;

        for(int i = 0; i < count; i++){
            String word = sc.next();
            chars = word.toCharArray();
            words = new boolean[26];

            for(int j = 1; j < chars.length; j++) {
                if (chars[j] != chars[j - 1]) {
                    if (words[chars[j] - 'a']) {
                        result--;
                        break;
                    }
                }
                words[chars[j - 1] - 'a'] = true;
            }

        }
        System.out.println(result);
    }
}