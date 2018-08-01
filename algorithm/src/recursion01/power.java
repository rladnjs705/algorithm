package recursion01;

public class power {
	public static void main(String[] args) {
		System.out.println(power(5,3));
	}
	
	public static double power(double x, int n) { // xÀÇ n½Â
		if (n==0)
			return 1;
		else
			return x*power(x, n-1);
	}
}
