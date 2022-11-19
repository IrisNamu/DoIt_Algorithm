package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
	static int binSearch(int[] arr, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스

			if (arr[pc] == key)
				return pc;

			else if (arr[pc] < key)
				pl = pc + 1;

			else
				pr = pc - 1;

		} while (pl <= pr);
		return -1; // 검색 실패
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("요솟수 : ");

		int num = sc.nextInt(); // 총 몇개 숫자인지
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // 오름차순 정리

		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();

		int idx = binSearch(arr, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) [" + idx + "] 에 있습니다.");
	}

}
