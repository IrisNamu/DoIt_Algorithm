package chap01;

public class Max3m {
	// a b c 최댓값 구하고 반환
	static int max3(int a, int b, int c) {

		int max = a;
		
		if (b > max)
			max = b;

		if (c > max)
			max = c;

		return max; // 구한 최댓값을 호출한 곳으로 반환
	}

	public static void main(String[] args) {
		System.out.println("(max3(3, 2, 1)) = " + max3(3, 2, 1));
		System.out.println("(max3(3, 3, 3)) = " + max3(3, 3, 3));
		System.out.println("(max3(1, 2, 2)) = " + max3(1, 2, 2));
	}
}

//(max3(3, 2, 1)) = 3
//(max3(3, 3, 3)) = 3
//(max3(1, 2, 2)) = 2
