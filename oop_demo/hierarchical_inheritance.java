package oop_demo;

class emp2{
	int empno;
	emp2(int empno)
	{
		this.empno = empno; 
	}
	
	int getId()
	{
		return empno;
	}
}


class admin extends emp2{
	admin(int empno)
	{
		super(empno);
	}
}



class fac2 extends emp2{
	fac2(int empno)
	{
		super(empno);
	}
}


public class hierarchical_inheritance {

	
	public static void main(String[] args)
	{
		fac2 obj = new fac2(130);
		System.out.println(obj.getId());
	}
}
