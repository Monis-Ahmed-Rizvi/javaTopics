package compareFunc;


class student implements Comparable <student>{

	private String name;
	private int id;
	
	public student(String name,int id)
	{
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return id - o.id;
	}
	
}



public class objCompare {

	public static void main(String[] args){
		
		
		student obj1 = new student("Monis",1000);
		student obj2 = new student("tom",1000);
		
		int res = obj1.compareTo(obj2);
		
		if(res<0)
		{
			System.out.println("obj1 < obj2");
		}
		else if(res>0)
		{
			System.out.println("obj1 > obj2");	
		}	
		else
		{
			System.out.println("obj1 == obj2");
		}
		
		
	}
}
