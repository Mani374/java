package javaPractice;

class Parent {
	public void sum1() {
		int a = 10;
		int b = 20;

		System.out.println(a + b);
	}
}

class Child extends Parent {
	public void sum2() {
		int a = 20;
		int b = 30;
		System.out.println(a + b);
	}
}

public class Exercise {

	public static void main(String[] args) {

		double d = 5.2;
		int i = (int) d;
		System.out.println(i);

		Parent p = new Child();

		Child c = (Child) p;
		c.sum2();
		int k = 10;
		Integer boxing = new Integer(k);
		int unboxing = boxing.intValue();

	}

}
