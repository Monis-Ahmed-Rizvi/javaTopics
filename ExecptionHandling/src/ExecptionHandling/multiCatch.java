package ExecptionHandling;
// demo of multiple catch block
// try catch hierarchy
// specific and general error 
public class multiCatch {
    
	public static void main(String[] args)
	{
		
		try {
			int[] arr = new int[10];
			//arr[10] = 20/10;
			String a = null;
			a.charAt(0);
			System.out.println("Exiting the try block");
		}
		catch(ArithmeticException ae){
			
			System.out.println("err "+ ae+ " caught ArithmeticException "+ "divide by zero no possible");	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("err"+ e+ " ArrayIndexOutOfBoundsException " + "  cannot access element does not exist  ");
		}
		catch(Exception e){
			System.out.println("any other generic error");
			System.out.println("error caught " +e.getMessage());
		}
		finally {
			System.out.println("Out of try catch block");
		}
		
		System.out.println("return to main ");
			
	}
}
