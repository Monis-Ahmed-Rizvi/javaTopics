package Aggregation;

import java.util.Arrays;
import java.util.List;
// Aggregation demo


public class AggDemo {
	
	
	public static void main(String[] args)
	{
		
		
	   airline Airline = new airline("Fly cry");
	   
	   passanger John = new passanger("john stupid");
	   passanger suzy = new passanger("suzy stupid");
	   
	   
	   Airline.setPassangers(Arrays.asList(John,suzy));
	   
	   List<passanger> passangers = Airline.getPassanger();
	   for(passanger p : passangers)
	   {
		   System.out.println("Passanger name is "+p.getName()+" flying on "+Airline.getName());
	   }
	   
	   
	   
	   
	   
	   
	   
		
	}

}
