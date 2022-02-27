package ct;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String answer="";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}else {
				answer += Character.toLowerCase(x);
			}
				
			
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {

		Main M = new Main();
		Scanner input = new Scanner(System.in);
		String str=input.next();
		System.out.println(M.solution(str));
		
	}

}
