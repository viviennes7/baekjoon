package BOJ_20170228;

import java.util.Scanner;


/**
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * */
public class BOJ2750 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		int count = scanner.nextInt();
		int [] intAry = new int [count] ;

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = scanner.nextInt();
		}
		
		intAry = rangeAry(intAry);
		
		for(int i : intAry){
			System.out.println(i);
		}
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
