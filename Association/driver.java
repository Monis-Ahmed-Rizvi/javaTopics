package Association;

import java.util.Arrays;
import java.util.List;

public class driver {
	
	
	public static void main(String[] args)
	{
  
	Company company = new Company("shit fuckery");
	
	Employee emp1 = new Employee("John Stupid");
	Employee emp2 = new Employee("Ron retard");
	
	company.setEmployee(Arrays.asList(emp1,emp2));
	List<Employee> employees = company.getEmployees();
	
	
	for(Employee emp: employees)
	{
		
		System.out.println(emp.getName()+" works at "+company.getName());
		
		
	}
	
	
	
	}		
	
	
}
