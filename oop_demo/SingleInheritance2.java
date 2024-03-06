package oop_demo;

class employee2{
	String name;
	int id;
	employee2(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	void display()
	{
		System.out.println(this.name+"::"+this.id);
	}	
}


class faculty2 extends employee2{
	
    String dept;
	faculty2(String name, int id,String dept)
	{  
		super(name,id);
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	void display()
	{
		System.out.println(this.name+"::"+this.id+"::"+this.dept);
	}
}





public class SingleInheritance2 {
	public static void main(String[] args)
	{
	    System.out.println("Hello world");		
	    faculty2 obj = new faculty2("Slave",101,"accounts");
	    employee2 obj1 = new employee2("Slave",101);
	    obj.display();
	    obj1.display();
	}
}
