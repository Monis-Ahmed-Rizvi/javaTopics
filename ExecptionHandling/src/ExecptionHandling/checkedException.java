package ExecptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


// Checked exception demo 
// compile time exception 


public class checkedException {
    // have to declare type of exception that the code can throw
	// two type are possible 
	// 1 file not found for the file buffer 
	// 2 IOException the input output exception 
	// IOException is enough for both 
	public static void main(String[] args) throws IOException
	{
		
		// will not work without exception handling 
		FileReader file = new FileReader("C:\\Users\\munis\\Desktop\\code\\java\\javaTopics\\ExecptionHandling\\src\\ExecptionHandling\\info.txt");
	    BufferedReader fileInput = new BufferedReader(file);
	    
	    for(int counter = 0;counter<3;counter++)
	    {
	    	System.out.println(fileInput.readLine());
	    }
	
	    
	    
	    fileInput.close();
	
	}
	
	
}
