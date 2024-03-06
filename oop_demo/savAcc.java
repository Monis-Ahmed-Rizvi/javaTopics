package oop_demo;

class savingAccount{
	
	private int accNumber;
	
	int getAccountNumber()
	{
		return this.accNumber;
	}
	
	
	public void setaccNumber(int number)
	{
		
		this.accNumber = number;
	}
		
}

public class savAcc {

	public static void main(String[] args)
	{
		System.out.print("Hello world");
		savingAccount sav_obj = new savingAccount();
		sav_obj.setaccNumber(000001);
		System.out.println(sav_obj.getAccountNumber());
	}
	
	
}
