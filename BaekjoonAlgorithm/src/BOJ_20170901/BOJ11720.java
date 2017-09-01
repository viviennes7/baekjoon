package BOJ_20170901;

import java.util.Scanner;

public class BOJ11720 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		String value = scanner.next();
		int sum = 0;
		
		for (int i = 0; i < cnt; i++) {
			char c = value.charAt(i);
			sum += c;
			
		}
		sum -= (cnt * '0');
		
		System.out.println(sum);
	}
}
