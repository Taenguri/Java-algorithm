import java.util.Scanner;

public class Main {	
	public String solution(int n, int[] a, int[] b){
		String answer="";
		for(int i=0; i<n; i++){									//-----A가 이길경우---	
			if(a[i]==b[i]) answer+="D";							// 비길경우를 빼준뒤,
			else if(a[i]==1 && b[i]==3) answer+="A";			// A가 이길 경우의 수를 구한다
			else if(a[i]==2 && b[i]==1) answer+="A";			// 총 3가지가 있다.
			else if(a[i]==3 && b[i]==2) answer+="A";
			else answer+="B";									// 나머지는 B의 승리
		}
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		for(int i=0; i<n; i++){
			b[i]=kb.nextInt();
		}
		for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
	}
}