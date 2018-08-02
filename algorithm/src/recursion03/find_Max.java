package recursion03;

public class find_Max {
	
	// �ִ� ã��
	int findMax(int[] data, int begin, int end) {
		if (begin == end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin + 1, end));
	}

	// �ִ� ã�� :�ٸ� ����
	int findMax2(int[] data, int begin, int end) {
		if (begin == end)
			return data[begin];
		else {
			int middle = (begin + end) / 2;
			int max1 = findMax2(data, begin, middle);
			int max2 = findMax2(data, middle + 1, end);
			return Math.max(max1, max2);
		}
	}
}
