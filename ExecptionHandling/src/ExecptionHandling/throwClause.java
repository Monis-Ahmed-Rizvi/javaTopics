package ExecptionHandling;

// not to be confused with throws 

// used to re throw exceptions 

// or for user defined exceptions 

public class throwClause {

	
	public static void main(String[] args)
	{
		
		try {
		int a = 100/0;
		System.out.println(a);
		} catch (ArithmeticException e){
			// don't eat the exception 
			throw new ArithmeticException("my custom message");
			
		}
				
		System.out.println("Hello world ");
		
	}
	
	
}
