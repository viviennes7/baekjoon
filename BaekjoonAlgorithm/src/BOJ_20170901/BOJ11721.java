package BOJ_20170901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11721 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String words = bf.readLine();
		int length = words.length();
		
		
		for (int i = 0; ; i+=10) {
			String splitStr = null;
			if(length > i+10){
				splitStr = words.substring(i, i+10);
				System.out.println(splitStr);

			}else{
				splitStr = words.substring(i, length);
				System.out.println(splitStr);
				break;
			}
		}
	}
}
