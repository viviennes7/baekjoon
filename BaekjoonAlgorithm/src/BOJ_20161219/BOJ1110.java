package BOJ_20161219;

import java.util.Scanner;

public class BOJ1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int param = scanner.nextInt();
		int a = 0;
		int b = 0;
		int result=0;
		int count =0;
		while(true){
			count++;
			if(count==1){
				result=param;
			}
			if(param>10){
				a=result/10;
				b=result%10;
			}else{
				a=0;
				b=result;
			}
			
			result = (a+b);
			
			System.out.println("param : " + param);
			
			if(param == result){
				System.out.println(count);
				break;
			}else{
				result=b*10+((a+b)%10);
				System.out.println("result : " + result);
			}
		}
	}
	
}
