package oop_demo;


// constructor calls 

class emp{
	emp()
	{
		System.out.println("Employee");
	}
}


class fac extends emp {
	fac()
	{
		System.out.println("faculty");
	}
}


class HOD extends fac{
	HOD()
	{
		System.out.println("HOD");
	}
}




public class mutli_inheritance {
   public static void main(String[] args)
   {
	   HOD obj  = new HOD();
   }
   
}
