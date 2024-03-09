package ExecptionHandling;

public class throwMyException {

	public static void main(String[] args) throws MyExceptionChk
	{
		
		int a = 100;
		//throw new  MyExceptionChk();
		System.out.println(a);
		throw new MyException("Here is my message ");
		
		
		
	}
	
	
}
