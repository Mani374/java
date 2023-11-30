package Practice;

public class Switch {
	private String name;
	private int salary;
	
	
// public static void main(String[] args) {
//		int code=1;
//     int disrate =
//		   switch (code) {
//		   case 1 -> 10;
//		  
//		   case 2 -> 20;
//		   case 3 -> 25;
//		   default -> 5;
//		   };
//	   System.out.println(disrate);
//   }
//	int a[]=new int	[5];
//	
//	
//	for(int b:a)
//		System.out.println(b);
//	}
//		System.out.println(getSum(20,30,60));
//	}
//		
//		public static int getSum(int ... nums)
//		{
//			int t =0;
//			
//			for(int n:nums) {
//			t+=n;}
//			return t;
//		}
//		
//
// 

//	}
	
	

	public void employee(String n, int s) {
		name = n;
		salary = s;
	}

	public void print() {
		System.out.println(name + "" + salary);
	}

	public static void main(String[] args) {
		Switch s = new Switch();
		
		Example e=new Example(10,"mani");
		System.out.println(e.sum(1,2));
		s.employee("manikanta", 2300);
		s.print();
		
	}
	
	public void setSalary(int sal)
	{
      salary=sal;
      
     }
	
	
	
    
	
}
