package oop_demo;

class employee{
	String name;
	int id;
	
	employee(){}
	
	employee(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
	void display()
	{
		System.out.println(this.name+"::"+this.id);
	}
	
}


class faculty extends employee{
	
	
    String dept;
	
	faculty(String name, int id,String dept)
	{
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	
	void display()
	{
		System.out.println(this.name+"::"+this.id+"::"+this.dept);
	}
	
	
}





public class SingleInheritance {

	public static void main(String[] args)
	{
	    System.out.println("Hello world");		
	    
	    faculty obj = new faculty("Slave",101,"accounts");
	    obj.display();
	    
	}
	
}
