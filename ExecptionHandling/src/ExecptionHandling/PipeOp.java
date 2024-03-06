package ExecptionHandling;
// Using pipe operator to lump multiple Exception together
public class PipeOp {
    
	public static void main(String[] args)
	{
		
		try {
			int[] arr = new int[10];
			arr[0] = 20/0;
			//String a = null;
			//a.charAt(0);
			System.out.println("Exiting the try block");
		}
		// similar situation for both the scenarios 
		catch(ArrayIndexOutOfBoundsException |ArithmeticException ae){
			
			System.out.println("err "+ ae+  " divide by zero no possible");	
		}
		catch(Exception e){
			System.out.println(" generic error");
			System.out.println(" caught " +e.getMessage());
		}
		finally {
			System.out.println("Out of try catch block");
		}
		
   
	}
}
