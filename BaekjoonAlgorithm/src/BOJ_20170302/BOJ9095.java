package BOJ_20170302;

import java.util.Scanner;

/**
 * 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지가 있다.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 * */
public class BOJ9095 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			int request = scanner.nextInt();
			System.out.println(getDp(request));
		}
		

		scanner.close();
	}
	
	public static int getDp(int count){
		int[] dp = new int[12];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 4; i <= count; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i - 3];
		}
		
		return dp[count];
	}
	
}
