package ExecptionHandling;

import java.util.Scanner;

public class prblm1 {
   
	
	public static void main(String[] args)
	{
		
		int n ;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Entern the size of the array ");
		n = sc.nextInt();
		
		
		int[] arr = new int[n];
		
		
		for(int i = 0;i<n;i++)
		{
			
			System.out.println("Enter the element  for the array"+i);
			arr[i] = sc.nextInt();
			
		}
		
		System.out.print("Enter the number to divide");
		int no = sc.nextInt();
		sc.close();
		
		
		try {
			
			
			try {
				for(int j = 0;j<n;j++)
				{
					System.out.println(arr[j]/no);
				}
			}
			catch(ArithmeticException e1){
				
				System.out.println(e1.getMessage());
			}
			
			System.out.println(arr[6]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
}
