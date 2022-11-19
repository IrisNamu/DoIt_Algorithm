package chap05_Recrusion;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println(x + "와 " + y + "의 최대공약수는? :" + GCD(x, y));
		System.out.println(x + "와 " + y + "의 최소공배수는? :" + LCM(x, y));
	}

	static int GCD(int x, int y) {
		if (y == 0)
			return x;

		return GCD(y, x % y);
	}

	// 최소공배수 구하기
	public static int LCM(int x, int y) {
		// 최소공배수는 두 수를 곱하고 최대 공약수로 나눈다.
		// 예) 6 10 -> 6 * 10 / 2 .... 즉 30이 최소공배수
		return x * y / GCD(x, y);
	}

}

//6 10
//6와 10의 최대공약수는? :2
//6와 10의 최소공배수는? :30
