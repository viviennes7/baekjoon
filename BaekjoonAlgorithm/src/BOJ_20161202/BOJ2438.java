package BOJ_20161202;

import java.util.Scanner;

public class BOJ2438 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String star = "";
		for(int i=0; i<n; i++){
			System.out.println(star+="*");
		}
	}
}
