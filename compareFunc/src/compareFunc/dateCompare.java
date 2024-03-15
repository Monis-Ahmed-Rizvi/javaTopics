package compareFunc;

import java.util.Date;

public class dateCompare {
    
	
	public static void main(String[] args)
	{
		
		Date date1 = new Date(System.currentTimeMillis() + 30000);
		Date date2 = new Date(System.currentTimeMillis() + 30000);
		
		
		int res = date1.compareTo(date2);
		
		
		if(res<0)
		{
			System.out.println("Date1 < Date2");
		}
		else if(res>0)
		{
			System.out.println("Date1 > Date2");
		}
		else
		{
			System.out.println("Date1 == Date2");
		}
		
		
		
	}
	
}
