package ExecptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;

// Try with resources Demo

// help auto  manage open resources 

// while try catch block you have to manually close resources 

// with try with resources resources are auto closed 

public class TryWR {

	
	public static void main(String[] args)
	{
		
		String filePath = "C://Users//munis//Desktop//code//java//javaTopics//ExecptionHandling//src//ExecptionHandling//tryWithResources.txt";
		
		try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
			String content = "Hello world ! iam trying my best";
			fileOutputStream.write(content.getBytes());
			System.out.println("Content written");
		}catch(IOException e){
			
			
			System.out.println("erorr occured"+e);
			
		}
		
		
		
	}
	
	
}
