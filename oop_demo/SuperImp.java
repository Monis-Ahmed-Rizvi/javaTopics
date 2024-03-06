package oop_demo;

// implementing uses of super 

class animal{
	String name;
	void eat()
	{
		System.out.println("Animal is eating");
	}
	
	animal(String name)
	{
		this.name = name;
	}
	
}


class Dog extends animal{
	
	Dog(String name)
	{
		super(name); // calling super class constructor 
	}
	
	void display()
	{
		System.out.println("Name "+ super.name);   //acessing the name attribute 
		super.eat(); // calling super class methods 
	}
	
	
	void eat()
	{
		System.out.println("dog eating ");
	}
}



public class SuperImp {

	public static void main(String[] args)
	{
		System.out.println("Hello");	
		Dog obj = new Dog("cheweene");
		obj.display();
		obj.eat();
	}
	
	
}
