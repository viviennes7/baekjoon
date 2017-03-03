package BOJ_20170302;

import java.util.Scanner;
/**
 * 위 그림은 크기가 5인 숫자 삼각형의 한 모습이다.
 * 맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 
 * 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 
 * 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
 * */
public class BOJ1932 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int [][] request = new int[count][count];
		int [][] dp = new int[count][count];
		
		
		int result = 0;
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
				request[i][j] = scanner.nextInt();
			}
		}
		
		dp[0][0] = request[0][0];
		
		for (int i = 0; i < count-1; i++) {
			for (int j = 0; j <= i; j++) {
				int leftVal = dp[i][j] + request[i+1][j];
				int rightVal = dp[i][j] + request[i+1][j+1];
				
				if(dp[i+1][j] < leftVal){
					dp[i+1][j] = leftVal;
				}
				
				if(dp[i+1][j+1] < rightVal){
					dp[i+1][j+1] = rightVal;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			if(dp[count-1][i] > result){
				result = dp[count-1][i];
			}
		}
		System.out.println(result);
	}
}
