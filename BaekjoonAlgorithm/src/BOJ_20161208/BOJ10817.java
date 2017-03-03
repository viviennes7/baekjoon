package BOJ_20161208;

import java.util.Scanner;
/**
 * 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * */
public class BOJ10817 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String[] value = a.split(" ");
		int v0 = Integer.parseInt(value[0]);
		int v1= Integer.parseInt(value[1]);
		int v2 = Integer.parseInt(value[2]);
		int temp = 0;
		String [] result = new String[3];

		if(v0>v1){
			 temp=v0;
			 v0=v1;
			 v1=temp;
		}
		
		if(v1>v2){
			temp=v1;
			v1=v2;
			v2=temp;
		}
		
		if(v0>v1){
			 temp=v0;
			 v0=v1;
			 v1=temp;
		}
		System.out.println(v1);

		scanner.close();
	}
}
