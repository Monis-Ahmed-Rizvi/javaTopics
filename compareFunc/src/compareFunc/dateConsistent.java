package compareFunc;
 

import java.time.LocalDate;

public class dateConsistent {

	public static void main(String[] args)
	{
		LocalDate moveInDate  =  LocalDate.of(2022,12,01); 
		LocalDate moveOutDate =  LocalDate.of(2023,3,1);
		
		int res = moveInDate.compareTo(moveOutDate);
		
		if(res<0)
		{
			System.out.println("num1 < num2");
		}
		else if(res>0)
		{
			System.out.println("num1 > num2");
		}
		else
		{
			System.out.println("num1 == num2");
		}
		
		
	}
	
	
}
