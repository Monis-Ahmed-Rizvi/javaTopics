package Association;

import java.util.List;

public class Company {

	private String name;
	private List<Employee> Employees;
	
	
	public Company(String name)
	{
		this.name = name;
	}
	
	
	
	public List<Employee> getEmployees()
	{
		return this.Employees;
	}
	
	public void setEmployee(List<Employee> Employees)
	{
		this.Employees = Employees;
	}
	
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	
}
