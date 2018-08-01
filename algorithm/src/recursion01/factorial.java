package recursion01;

public class factorial {
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1; // 팩토리얼의 정의: 0! = 1 이다. 
		else
			return n*factorial(n-1); 
	}
}
