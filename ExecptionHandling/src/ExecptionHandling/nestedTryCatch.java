package ExecptionHandling;

public class nestedTryCatch {
	
	
	public static void main(String[] args)
	{
	
	try {// block 1
		try {//block2
             try{// block 3
					
            	 int[] arr = new int[5];
            	 arr[0] = 2;
            	 arr[1] = 3;
            	 arr[2] = 10;
 	             System.out.println(arr[7]); // matching to the correct error 
            	 
			 }catch(NullPointerException e1){
					System.out.println("Block 3");
					//throw e1;
			 }
		}catch(StringIndexOutOfBoundsException e2){
			System.out.println("Block 2");
			//throw e2;
		}
	}catch(ArrayIndexOutOfBoundsException e3){
	System.out.println("Block 1 (outter most)");
   }
	
  }
	
	
}	

