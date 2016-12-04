package BOJ_20161202;

import java.util.Scanner;

public class BOJ2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n; j++){
				if(i >= (n-j+1) ){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
