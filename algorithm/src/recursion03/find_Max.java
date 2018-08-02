package recursion03;

public class find_Max {
	
	// 최댓값 찾기
	int findMax(int[] data, int begin, int end) {
		if (begin == end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin + 1, end));
	}

	// 최댓값 찾기 :다른 버전
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
