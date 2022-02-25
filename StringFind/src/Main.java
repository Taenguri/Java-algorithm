

import java.util.Scanner;

public class Main {
	
	public int solution(String inputString, char inputChar) {
		
		int cnt = 0;

		// 값 비교를 위해 대문자로 변경
		inputString = inputString.toUpperCase();
		inputChar = Character.toUpperCase(inputChar);
		
		for(int i = 0; i<inputString.length(); i++) {
			if(inputString.charAt(i) == inputChar) cnt++;
		}
		
		return cnt;
		
	}
	
	
	public static void main(String[] args) {

		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		
		String inputString=sc.next();
		char inputChar=sc.next().charAt(0);
		
		
		System.out.println(m.solution(inputString, inputChar));
		
		
		
		
		
		
	}

}
