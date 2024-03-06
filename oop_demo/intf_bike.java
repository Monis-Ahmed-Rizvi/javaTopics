package oop_demo;


interface bike_i {
	void run();
}


class honda_i implements bike_i{
	public  void run()
	{
		System.out.println("honda running ...");
	}
}

class pulsar_i implements bike_i{
	public void run()
	{
		System.out.println("Pulsar running >>>>>");
	}
}


class KTM_i implements bike_i {
	public void run()
	{
		System.out.println("KTM <><><><><><><><> RUNNINGG!!!");
	}
}



public class intf_bike {

	public static void main(String[] args)
	{
		
		honda_i h_obj = new honda_i();
		pulsar_i p_obj = new pulsar_i();
		KTM_i K_obj = new KTM_i();
		
		
		h_obj.run();
		p_obj.run();
		K_obj.run();
		
		
	
	}
	
	
}
