package asdasd;

import java.util.Scanner;

public class onlynumber {

	
	public int solution(String s) {
		
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x>= 48 && x <=57) answer = answer*10 +(x-48);
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		onlynumber T = new onlynumber();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
	
}

