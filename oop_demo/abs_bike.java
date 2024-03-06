package oop_demo;


abstract class bike {
	
	abstract void run();
	
}


class honda extends bike{
	@Override
	void run() {
		System.out.println("Honda running ");
	}
	
}


class pulsar extends bike{
	@Override
	void run() {
		System.out.println("Pulsar running ");
	}
}




class KTM extends bike{
	@Override 
	void run()
	{
		System.out.println("KTM running");
	}
}



public class abs_bike {

	
	public static void main(String[] args)
	{
		
		
		KTM KTM_obj = new KTM();
		KTM_obj.run();
		
	}
	
	
}
