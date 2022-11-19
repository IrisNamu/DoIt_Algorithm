package chap05_Recrusion;

import java.util.Scanner;

public class Hanoi_1 {

	// 기둥은 총 3개이다

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 원반 개수
		sc.close();

		move(N, 1, 3);// 1번 기둥의 N개의 원반을 3번으로 옮김
	}

	/*
	 * num : 원판의 개수 from : 출발지 to : 목적지
	 */

	static void move(int num, int from, int to) {


		if (num > 1)
			move(num - 1, from, 6 - from - to);

		System.out.println("원반[" + num + "]을 " + from + " -> " + to);

		if (num > 1)
			move(num - 1, 6 - from - to, to);
	}
}
