package BOJ_20170301;

import java.util.Scanner;

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
