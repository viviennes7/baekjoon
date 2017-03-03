package BOJ_20170301;

import java.util.Scanner;

/**
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 다섯 가지이다.push X: 정수 X를 스택에 넣는 연산이다.
 * push: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * pop: 스택의 가장 위에 있는 정수를 출력한다. 
 * 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.* */
public class BOJ10828 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int [] intAry = new int[count];   //사실은 카운트보다 적은 수가 들어감 
		int lastIndex = -1;
		
		for (int i = 0; i < count; i++) {
			String command = scanner.next();

			if(command.contains("push")){
				int pushNumber = scanner.nextInt();

				lastIndex++;
				intAry[lastIndex] = pushNumber;
				
			}else if(command.equals("pop")){
				if(lastIndex >= 0){
					System.out.println(intAry[lastIndex]);
					intAry[lastIndex] = 0;
					lastIndex--;
				}else if(lastIndex < 0){
					System.out.println(-1);
				}
				
			}else if(command.equals("size")){
				System.out.println(lastIndex + 1);
				
			}else if(command.equals("empty")){
				if(lastIndex == -1 ){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
				
			}else if(command.equals("top")){
				if(lastIndex == -1){
					System.out.println(-1);
				}else{
					System.out.println(intAry[lastIndex]);
				}
			}
		}
	}
}
