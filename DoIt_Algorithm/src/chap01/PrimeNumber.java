package chap01;

/*
 * 1000 이하의 소수 나열하기
 */
public class PrimeNumber {

	public static void main(String[] args) {

		int cnt = 0;
		boolean isPrime;
		for (int i = 2; i <= 1000; i++) {
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				cnt++;
				if (i % j == 0) { // 나눠 떨어지면 소수가 아님
					isPrime = false;
					break;
				}
			}

			// isPrime이면 소수
			if (isPrime) {
				System.out.println(i);
			}
		}
		System.out.println("나눗셈을 수행한 개수 : " + cnt);
	}
}
