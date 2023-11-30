package Example;

 interface Laptop {
	public static void print();
}
 interface System{
	 void print();
 }
class Interface implements Laptop,System{
	public static void print()
	{
		System.out.println("");
	}
}
public class TestInterface {
	public static void main(String[]args)
	{
		TestInterface t=new TestInterface();
	    t.print();
	}

}
