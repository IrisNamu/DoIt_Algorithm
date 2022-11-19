package chap04;

public class IntQueue {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐본체

	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 인큐에 성공하면 인큐한 값 그대로 반환
	// 큐가 가득차서 인큐할 수 없으면 -1 반환
	public int enque(int x) {
		if (num >= max)
			return -1;
		que[rear++] = x;
		num++;
		// rear값을 1만큼 증가했을 때 큐의 최대 용량인 max와 같아지면
		// rear의 배열의 처음인 0으로 변경
		if (rear == max)
			rear = 0;
		return x; // 인큐한 값 반환
	}

	// 큐에서 데이터 디큐
	// 큐가 비어있어 디큐할 수 없으면 -1 반환
	public int deque() {
		if (num <= 0)
			return -1;
		int x = que[front++]; // 저장된 값 꺼내고 커서 위치 1증가
		num--; // 하나 꺼냈으니 총 용량인 num 하나 감소

		// 디큐하기 전의 front가 배열의 끝이면 과정 거치고 배열 마지막 요소 초과함
		// front의 배열의 처음인 0으로 변경
		if (front == max)
			rear = 0;
		return x; // 인큐한 값 반환
	}

	// 큐 피크(가장 맨 위에 있는 데이터)
	public int peek() {
		if (num <= 0)
			return -1;
		return que[front];
	}

	// 찾고자 하는 x 데이터의 인덱스 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;

			if (que[idx] == x) {
				return idx;
			}
		}
		return -1; // 검색 실패
	}

	// 큐 비우기
	public void clear() {
		num = front = rear = 0;
	}

	// 큐 용량 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여있는 데이터 수 반환
	public int size() {
		return num;
	}

	// 큐가 비어있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼나요>
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터 출력(선입선출
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
				System.out.println();
			}
		}
		
		
	}

	public static void main(String[] args) {

	}

}
