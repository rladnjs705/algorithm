package recursion01;

public class Code03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);//4+3+2+1=10
	}
	
	public static int func(int n) { // 이 함수의 mission은 0~n까지의 합을 구하는 것이다.
		if(n == 0)
			return 0; // n=0이라면 합은 0 이다.
		else {
			return n + func(n-1); // n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것 이다.
		}
	}
}
