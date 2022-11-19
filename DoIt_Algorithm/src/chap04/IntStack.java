package chap04;

public class IntStack {
	private int max; // 스택용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택본체

	// 실행시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// 실행시 예외 : 스택이 가득 참
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
		}
	}

//생성자
	public IntStack(int capacity) {
		ptr = 0;// 생성 시 스택은 비어있으므로
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	// 푸시 메서드 push
	public int push(int x) throws OverflowStackException {
		if (ptr >= max)
			throw new OverflowStackException();

		// 전달받은 데이터 x를 배열에 저장하고 스택포인터 증가
		return stk[ptr++] = x;
	}

	// 팝 메서드 pop
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 검색메서드 IndexOf
	// 스택에서 x를 찾아 인덱스를 반환
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x)
				return i; // 검색 성공
		}
		return -1; // 검색 실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0; // 비어있으면 true
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max; // 가득 차면 true
	}

	// 스택 안에 있는 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {

	}
}
