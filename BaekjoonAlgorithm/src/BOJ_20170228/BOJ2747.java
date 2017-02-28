package BOJ_20170228;

import java.util.Scanner;

public class BOJ2747 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int a = 0;
		int b = 1;
		
		for (int i = 1; i < count; i++) {
			int temp = b;
			b += a;
			a = temp;
		}

		System.out.println(b);
	}
}
