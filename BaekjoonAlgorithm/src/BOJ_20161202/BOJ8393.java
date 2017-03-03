package BOJ_20161202;

import java.util.Scanner;

public class BOJ8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		for(int i = 1; i<=n; i++){
			result+=i;
		}
		System.out.println(result);

		scanner.close();
	}
}
