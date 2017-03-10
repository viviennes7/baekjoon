package BOJ_20170307;

import java.util.Scanner;

public class BOJ1934 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int request1 = scanner.nextInt();
		int request2 = scanner.nextInt();
		int length = 0;
		
		length = request1 > request2 ? request1 : request2;
		
		for (int i = 2; i < length; i++) {
			if(request1 % i == 0 && request2 % i == 0){
				
			}
		}
		
		scanner.close();
	}
}
