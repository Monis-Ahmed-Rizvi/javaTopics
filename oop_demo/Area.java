package oop_demo;

 class shape {
      
	
	double calcArea(int a)
	{
		return a*a;
	}
	
	
	
	double calcArea(int a,int b)
	{
		return a*b;
	}
	
	double calcArea(double a )
	{
		return 3.14*a*a;
	}
	
}


 public class Area{
	 public static void main(String[] args)
	 {
		 
		 shape obj = new shape();
		 System.out.println(obj.calcArea(2)+" Square");
		 System.out.println(obj.calcArea(2, 6)+" Reactangle");
		 System.out.println(obj.calcArea(5)+" Circle");
	 }
 }

