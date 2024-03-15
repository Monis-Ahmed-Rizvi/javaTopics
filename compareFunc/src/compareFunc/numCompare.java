package compareFunc;

public class numCompare {

	public static void main(String[] args)
	{
		
		Integer num1 = 200;
		Integer num2 = 30;
		
		int res = num1.compareTo(num2);
		
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
