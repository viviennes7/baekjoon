package BOJ_20170901;

import java.util.Scanner;

public class BOJ1003 {
	int zeroCnt;
	int oneCnt;
	
	public static void main(String[] args) {
		BOJ1003 boj = new BOJ1003();
		boj.process();
	}
	
	public void process(){
		Scanner scanner = new Scanner(System.in);
		int paramCnt = scanner.nextInt();
		for(int i=0; i<paramCnt; i++){
			int n = scanner.nextInt();
			this.fibonacci(n);
			System.out.println(zeroCnt + " " + oneCnt);
			zeroCnt = 0;
			oneCnt = 0;
		}
	}
	
	public int fibonacci(int n){
		if(n == 0){
			zeroCnt++;
			return 0;
		}else if(n == 1){
			oneCnt++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
