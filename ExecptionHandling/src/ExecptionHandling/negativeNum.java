package ExecptionHandling;

class NegativeNumException extends Exception{
	public NegativeNumException(String s)
	{
		super(s);
	}
}



public class negativeNum {

	
	
	public static int  noNegativeNum(int x) throws NegativeNumException
	{
		if( x < 0)
		{
			throw new NegativeNumException("Number can not be negative");
		}
		
		return x;
	}
	
	
	public static void main(String[]args)
	{
		
		  int x = -5;
		
		
		  try {
			  int res = noNegativeNum(x);
			  System.out.println(res);
	        } catch (NegativeNumException  e) {
	            System.out.println(e.getMessage());
	        }
	}
	
	
	
	
}
