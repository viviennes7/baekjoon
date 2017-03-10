package BOJ_20170307;

import java.util.Scanner;
/**
 * 주어진 숫자들 중 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * */
public class BOJ1978 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int result = 0;
		int request[] = new int[count];
		
		for (int i = 0; i < count; i++) {
			 request[i]= scanner.nextInt();
			 
			 for (int j = 2; j <= request[i]; j++) {
				
				 if(j == request[i]){
					 result++;
					 break;
				}
				
				if(request[i] % j == 0){
					break;
				}
			}
		}
		System.out.println(result);
		
		scanner.close();
	}
}
