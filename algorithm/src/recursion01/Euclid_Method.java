package recursion01;

public class Euclid_Method {

		public static void main(String[] args) {
			System.out.println(gcd(100,15));
		}
	
		public static int gcd(int m, int n) {
			if(m<n) {
				int tmp=m; m=n; n=tmp; // swap m and n
			}
			if (m%n==0)
				return n;
			else
				return gcd(n, m%n);
		}
		// m>=n�� �� ���� ���� m�� n�� ���ؼ� m�� n�� ����̸� gcd(m,n)=n�̰�, �׷��� ������ gcd(m,n)=gcd(n,m%n)�̴�.

		// �� �� �ܼ��� ����
		public static int gcd2(int p, int q) {
			if (q==0)
				return p;
			else
				return gcd(q, p%q);
		}
}
