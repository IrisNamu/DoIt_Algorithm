package chap05_Recrusion;

import java.util.Scanner;

public class Hanoi_2 {

	// 기둥은 총 3개이다

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 원반 개수
		sc.close();

		move(N, 1, 3, 2);
	}

	/*
	 * num : 원판의 개수, from : 출발지, mid: 옯기기 위한 보조, to : 목적지
	 */

	static void move(int num, int from, int to, int mid) {

		if (num == 1) {
			System.out.println("0원반[" + num + "]을 " + from + " -> " + to);
			return;
		}
		// STEP 1 : N-1개를 A에서 B로 이동
		move(num - 1, from, mid, to);

		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		System.out.println("원반[" + num + "]을 " + from + " -> " + to);

		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		move(num - 1, mid, to, from);

	}
}
