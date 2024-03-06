package ExecptionHandling;

import java.io.*;

public class finallyDemo {

	
	public static void main(String[] args) throws IOException
	{
		
		FileReader file = null;
		BufferedReader fileInput = null;
		
	    try {
	    	file = new FileReader("C:\\Users\\munis\\Desktop\\code\\java\\javaTopics\\ExecptionHandling\\src\\ExecptionHandling\\info.txt");
	    	fileInput = new BufferedReader(file);
	    	
	    	for(int i = 0;i<3;i++)
	    	{
	    		System.out.println(fileInput.readLine());
	    	}
	    	
	    	
	    }
	    catch(FileNotFoundException e)
	    {
	    	System.err.println("caught FileNotFoundException"+e.getMessage());
	    }
	    finally {
	    	if(fileInput!=null)
	    	{
	    		System.out.println("Closing the buffred reader");
	    		fileInput.close();
	    	}
	    	else
	    	{
	    		System.out.println("Buffer reader is null ");
	    	}
	    	if(file!=null)
	    	{
	    		System.out.println("Closing the File reader ");
	    		
	    		fileInput.close();
	    	}
	    	else
	    	{
	    		System.out.println("file reader is null");
	    	}
	    }
		
		
	}
	
}
