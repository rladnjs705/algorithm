package recursion01_1;

import java.util.Scanner;

public class readFrom {

	public void readFrom(int n, int[] data, Scanner in) {

		if (n == 0)
			return;
		else {
			readFrom(n - 1, data, in);
			data[n-1] = in.nextInt();
		}
	}
}
