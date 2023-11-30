package Practice;

class A {
	public static void print() {
		System.out.println("hello");
	}
}

class B extends A {
	public static void print() {
		System.out.println("Godd morning");
	}
}
public class TestClass {

	public static void main(String[] args) {

		// A a=new A();
		A a = new B();
		a.print();

	}

}
