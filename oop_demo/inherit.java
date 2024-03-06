package oop_demo;


class parent{
	void intro()
	{
		System.out.println("Parent");
	}	
}

class child extends parent  {
	@Override
	void intro()
	{
		System.out.println("Child");
	}
}

public class inherit {

	public static void main(String[] args)
	{
		child c_obj = new child();
		c_obj.intro();
		
		parent p_obj = new parent();
		p_obj.intro();	
	}
	
	
}
