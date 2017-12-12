package BOJ_20171212;

import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int[] wordCounts = new int[26];
        int maxIndex = 0;
        char[] chars = word.toCharArray();
        int maxCount = 0;

        for(char c : chars){
            wordCounts[(c - 'A')]++;
        }

        for(int i = 0; i < wordCounts.length; i++){
            maxIndex = wordCounts[maxIndex] < wordCounts[i] ? i : maxIndex;
        }

        for(int i : wordCounts){
            if(i == wordCounts[maxIndex]){
                maxCount++;
            }
        }

        if(maxCount > 1){
            System.out.print("?");
        }else {
            System.out.print((char) (maxIndex + 'A'));
        }
    }
}
