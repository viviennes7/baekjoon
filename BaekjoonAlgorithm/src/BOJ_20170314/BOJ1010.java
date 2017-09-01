package BOJ_20170314;

import java.util.Scanner;

public class BOJ1010 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		int m = 0;
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			for(int j = 0; i < 2; j++){
				m = scanner.nextInt();
				n = scanner.nextInt();
				System.out.println(getCombination(n,m));
			}
		}
		
		scanner.close();
	}
	
	public static int getCombination(int n, int m){
		
		double val = 1;
		int result = 0;
		
		if(n-m < m){
			m = n-m;
		}
		
		for (int i = 0; i < m; i++) {
			val *= (n-i);
			val /= (m-i);
		}
		
		result = (int)Math.round(val);
		
		return result;
	}
}
