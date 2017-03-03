package BOJ_20161219;

import java.util.Scanner;

public class BOJ10871 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String result = null;
		int comparison = Integer.parseInt(a.split(" ")[1]);
		
		boolean flag = false;  
		String[] value = b.split(" ");
		
		
		for(String str : value){
			if(Integer.parseInt(str)<comparison){
				if(flag == false){
					result=str;
					flag=true;
				}else{
					result+=" " + str;
				}
			}
		}
		System.out.println(result);

		scanner.close();
	}
	
}
