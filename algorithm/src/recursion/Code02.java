package recursion;

	//recursion�� �׻� ���ѷ����� ������? ==>X
public class Code02 {
	public static void main(String[] args) {
		int n = 4;
		func(n);
	}
	
	public static void func(int k) {
		if (k<=0)	//Base case: ��� �ϳ��� recursion�� ������ �ʴ� ��찡 �����ؾ� �Ѵ�.
			return;
		else {
			System.out.println("Hello...");
			func(k-1);	//Recursive case: recursion�� �ݺ��ϴٺ��� �ᱹ base case�� �����ؾ� �Ѵ�.
		}
	}
}
