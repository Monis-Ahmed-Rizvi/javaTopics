package ExecptionHandling;


// demo for try catch 

import java.util.ArrayList;
import java.util.List;

public class tryCatch {

	public static void main(String[] args)
	{
		
		
		try {
			 List<Integer> list = new ArrayList<>();
			 list.add(10);
			 System.out.println("Entrting the try statment ");
			 Integer a = list.get(1);
			 System.out.println("assesing the first element "+a);
			 
			
		}
		catch(IndexOutOfBoundsException e){
			System.err.println("Error caught IndexOutOfBoundsException: "+ e.getMessage());
			
			//System.out.println("Error caught IndexOutOfBoundsException: "+ e.getMessage());
			
		}
		finally {
			System.out.println("Finally code");
		}
	}
	
	
}
