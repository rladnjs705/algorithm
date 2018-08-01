package recursion01;

public class Fibonacci_Number {
	public static void main(String[] args) {
		
	}
	
	public int fibonacci(int n) {
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
