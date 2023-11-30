package javaPractice;

public class TestInterface {

	public static void main(String[] args) {
		Operation o = new MyOperation();
		System.out.println("Additon of two nums are= " + o.add());
		System.out.println("Subtractin of two nums are= " + o.subtract());
		System.out.println("multiplication of two nums are= " + o.multiply());
		System.out.println("Division of two nums are= " + o.divide());
		System.out.println("modulus of two nums are= " + o.modulus());
	}

}
