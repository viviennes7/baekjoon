package BOJ_20170301;

import java.util.Scanner;

/**
 * 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다. 
 * */
public class BOJ2577 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count1 = scanner.nextInt();
		int count2 = scanner.nextInt();
		int count3 = scanner.nextInt();
		
		int multiplyResult = (count1 * count2 * count3);
		int length = getLengh(multiplyResult);
		int[] intAry = getCounts(multiplyResult, length);
		
		for(int i : intAry){
			System.out.println(i);
		}
	}
	
	public static int getLengh(int num){
		
		int length = 0;
		
		for (int i = 0; ; i++) {
			double calc = num / Math.pow(10, i);
			if(calc < 1){
				length = i;
				break;
			}
		}
		
		return length;
	}
	
	public static int[] getCounts(int num, int length){
		int[] result = new int[10];
		
		for (int i = 0; i < length; i++) {
			int count = ((int)(num / Math.pow(10, i))) % 10;
			result[count]++;
		}
		
		return result;
	}
}
