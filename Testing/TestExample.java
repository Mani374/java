package Testing;

public class TestExample {
	int t;

	public int sum(int... nums) {
		for (int n : nums) {
			t += n;
		}
		return t;

	}

	public static void main(String[] args) {
		TestExample t = new TestExample();
		TestExample t1 = new TestExample();
		System.out.println(t.sum(20, 30));

		System.out.println(t1.sum(20, 30, 50));

	}

}
