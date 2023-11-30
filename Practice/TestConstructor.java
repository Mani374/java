package Practice;

 class Constuctor {
int salary;
String name;
public Constuctor(int sal,String n)
{
	name=n;
	salary=sal;
	
	
}
public void print()
{
	System.out.println(name+""+salary);
}
 
 }
 
public class TestConstructor
{
	public static void main (String[]args)
	{
		Constuctor c= new Constuctor(1234,"mani");
		
		c.print();
	}
	
	
	
}