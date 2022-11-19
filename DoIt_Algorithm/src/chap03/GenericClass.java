package chap03;

public class GenericClass {
	static class Generic<T> {
		private T xyz;

		Generic(T t) {// 생성자
			this.xyz = t;
		}

		T getxyz() { // xyz 반환
			return xyz;
		}

	}

	public static void main(String[] args) {
		Generic<String> s = new Generic<String>("ABC");
		Generic<Integer> n = new Generic<Integer>(24);

		System.out.println(s.getxyz());
		System.out.println(n.getxyz());
	}
}