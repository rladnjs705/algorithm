package recursion01;

public class Code03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);//4+3+2+1=10
	}
	
	public static int func(int n) { // �� �Լ��� mission�� 0~n������ ���� ���ϴ� ���̴�.
		if(n == 0)
			return 0; // n=0�̶�� ���� 0 �̴�.
		else {
			return n + func(n-1); // n�� 0���� ũ�ٸ� 0���� n������ ���� 0���� n-1������ �տ� n�� ���� �� �̴�.
		}
	}
}
