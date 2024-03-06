package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class airline {

	private String name;
	private List<passanger> passangers ;
	
	public airline(String name)
	{
		this.name = name ;
		
	}
	
	
	public String getName()
	{
		return this.name;
		
	}
	
	public void setPassangers(List<passanger> passangers)
	{
		this.passangers = passangers;
		
	}
	
	public List<passanger> getPassanger() 
	{
		return this.passangers;
	}
	
	
	
}
