package Composition;

public class Driverc {

	
	public static void main(String [] args)
	{
		House house = new House(200,300);
		Kitchen kitchen = new Kitchen(40,80);
		
		house.setKitchen(kitchen);
		
		System.out.println("Kitchen's Lenght is "+house.getKitchen().getLenght()+" Kitchen's Lenght is "+house.getKitchen().getWidth());
		
		
	}
	
	
}
