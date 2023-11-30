package javaPractice;
public interface Queue {
	void add(int data);

	int remove();

	int length();

	boolean isEmpty();

	void print();
}

class MyQueue implements Queue {
	int queue[] = new int[5];
	int size;
	int first;
	int last;

	public void add(int data) {
		if (!isFull()) {
			queue[last] = data;
			last = (last + 1) % 5;
			size = size + 1;
		}

	}

	public int remove() {
		int data = queue[first];
		first = (first + 1) % 5;
		size = size - 1;
		return data;

	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(first + i) % 5] + " ");

		}
		System.out.println();
	}

	public int length() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == 5;
	}

}