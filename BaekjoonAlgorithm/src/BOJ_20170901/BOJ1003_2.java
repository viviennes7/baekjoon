package BOJ_20170901;

import java.util.Scanner;

public class BOJ1003_2 {
	
	public static void main(String[] args) {
		int[][] value = new int[41][2];
		
		value[0][0] = 1;
		value[0][1] = 0;
		value[1][0] = 0;
		value[1][1] = 1;
		
		for(int i = 2; i < 41; i++){
			value[i][0] = value[i-1][0] + value[i-2][0];
			value[i][1] = value[i-1][1] + value[i-2][1];
		}
		
		Scanner scanner = new Scanner(System.in);
		int paramCnt = scanner.nextInt();
		
		for(int i = 0; i < paramCnt; i++){
			int n = scanner.nextInt();
			System.out.println(value[n][0] + " " + value[n][1]);
		}
	}
}
