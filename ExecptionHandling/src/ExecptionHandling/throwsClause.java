package ExecptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwsClause {
	
	
	 //callee code 
	
      public void readFile() throws IOException {
    	  FileReader file = null;
    	  BufferedReader fileInput = null;
    	  
    	  try {
    		  file = new FileReader("C:\\Users\\munis\\Desktop\\code\\java\\javaTopics\\ExecptionHandling\\src\\ExecptionHandling\\info.txt");
    		  fileInput = new BufferedReader(file);
    		  
    		  for(int counter = 0;counter < 3;counter++)
    		  {
    			  System.out.println(fileInput.readLine());
    		  }
    		  
    	  }
    	  
    	  // this part can be commented out  as we are using throws 
    	  /*catch(FileNotFoundException e)
    	  {    // if you remove this their will not be an issue as IOException is parent class of FileNotFoundException
    		  System.out.println("Caught FileNotFoundException "+e.getMessage());
    	  } catch (IOException e) {
			
    		// if you don't want to add a throws clause you can handle it with catch 
			e.printStackTrace();
		}*/
    	  
    	  finally {
    		  if(fileInput != null)
    		  {
    			  System.out.println("closing the buffred reader");
    			  fileInput.close();
    		  }
    		  else
    		  {
    			  System.out.println("buffred reader is null can not close");
    		  }
    		  if(file!=null)
    		  {
    			  System.out.println("closing file reader");
    		  }
    		  else
    		  {
    			  System.out.println("file reader is null can not close");
    		  }
    	  }
      }
      
      
      
     // main 
      
    // caller code 
	// has to handle the exception 
      public static void main(String[] args) /* throws IOException */ 
      {
    	  
    	  throwsClause obj1 = new throwsClause(); 
    	  
    	  /*obj1.readFile();*/
    	  
    	  try 
    	  {
    	   obj1.readFile();
    	  }
    	  catch(IOException e){
    		  System.out.println(e.getMessage());
    	  }
    	  
    	  
    	  // if this function does not want to handle the exception then it can also use the thorwsClause 
    	  // but program will not exit gracefully
    	  
    	  
    	  System.out.println("program exit");
    	  
      }
      
      
      
}
