package chap05_Recrusion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalN = sc.nextInt();
		int findNum = sc.nextInt();
		sc.close();

		for (int i = 0; i < totalN; i++) {
			System.out.print(fibo(i) + " ");
		}
		System.out.println("\n" + findNum + "번째 숫자는? : " + fibo(findNum));
	}

	static int fibo(int n) {
		if (n <= 1) {
			return 1;
		} else {
			// 피보나치 수열은 앞의 두항의 합이 협재의 항의 값이 된다
			return fibo(n - 1) + fibo(n - 2);

		}
	}
}

//13
//5
//console
//1 1 2 3 5 8 13 21 34 55 89 144 233 
//5번째 숫자는? : 8
