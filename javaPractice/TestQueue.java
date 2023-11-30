package javaPractice;

public class TestQueue {

	public static void main(String[] args) {
		Queue q = new MyQueue();
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.print();
		q.remove();
		q.remove();
		q.add(7);
		q.print();
		System.out.println("the length is " + q.length());
		System.out.println(q.isEmpty());

	}

}
