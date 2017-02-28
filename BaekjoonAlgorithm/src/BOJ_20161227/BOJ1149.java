package BOJ_20161227;

import java.util.Scanner;

/**
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
 * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다. 
 * 처음 집과 마지막 집은 이웃이 아니다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 
 * 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 * */
public class BOJ1149 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int houseCount = Integer.parseInt(scanner.nextLine());
		int result = 0;
		
		String rgb = scanner.nextLine();
		int[] rgbAry = changeIntAry(rgb);
		
		int minR = rgbAry[0];
		int minG = rgbAry[1];
		int minB = rgbAry[2];
		
		
		
		for (int i = 1; i < houseCount; i++) {
			rgbAry = changeIntAry(scanner.nextLine());
			
			int r = ( minG < minB ? minG : minB) + rgbAry[0];
			int g = ( minR < minB ? minR : minB) + rgbAry[1];
			int b = ( minG < minR ? minG : minR) + rgbAry[2];
			
			minR = r;
			minG = g;
			minB = b;
			
		}
		
		result = minR < minG ? (minR < minB ? minR : minB) : (minG < minB ? minG : minB);
		
		System.out.println(result);
	}
	
	public static int[] changeIntAry(String str){
		String[] strAry = str.split(" ");
		int [] intAry = new int[3];
		
		for(int i=0; i<strAry.length; i++){
			
			intAry[i] =Integer.parseInt(strAry[i]);
		}
		
		return intAry;
	}
}
