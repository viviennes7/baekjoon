package BOJ_20170228;

import java.util.Scanner;


/**
 * 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 
 * 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
 * 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
 * S = A[0]*B[0] + ... + A[N-1]*B[N-1]S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 
 * 단, B에 있는 수는 재배열하면 안된다.
 * S의 최솟값을 출력하는 프로그램을 작성하시오.
 * */
public class BOJ1026 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		int result = 0;
		
		int[] aAry= changeIntAry(scanner.nextLine(), count);
		int[] bAry= changeIntAry(scanner.nextLine(), count);
		
		int[] aRangeAry = rangeAry(aAry);
		int[] bRangeAry = rangeAry(bAry);
		
		for (int i = 0; i < count; i++) {
			result += aRangeAry[i] * bRangeAry[count-i-1]; 
		}
		
		System.out.println(result);
	}
	
	public static int[] changeIntAry(String str, int count){
		String[] strAry = str.split(" ");
		int [] intAry = new int[count];
		
		for(int i=0; i<strAry.length; i++){
			
			intAry[i] =Integer.parseInt(strAry[i]);
		}
		
		return intAry;
	}
	
	public static int[] rangeAry(int[] originalAry){
		for(int i=0; i<originalAry.length; i++){
			for (int j = i+1; j < originalAry.length; j++) {
				
				int temp = 0;
				
				if(originalAry[i] > originalAry[j]){
					temp = originalAry[i];
					originalAry[i] = originalAry[j];
					originalAry[j] = temp;
				}
			}
		}
		
		return originalAry;
	}
}
