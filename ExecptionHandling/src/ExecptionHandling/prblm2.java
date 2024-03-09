package ExecptionHandling;

public class prblm2 {
  
	public static void main(String[] args)
	{
		
		int[] arr = new int[5];
		
		
		try {
		String s = null;
		int x = 2/10;
		s.charAt(0);
		
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("caught"+ae.getMessage());
		}
		catch(NullPointerException ne)
		{
			System.out.println("caught f"+ne.getMessage());
		}
		
		catch(Exception e1)
		{
			System.out.println("caught "+e1.getMessage());
		}
		
		
		
		
	}
	
	
}
