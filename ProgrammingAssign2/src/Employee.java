/**
 * 
 * @author Derek Wider
 *
 */
public class Employee {
	private String name;
	private double salary;
	private double minimumWage = 8.00; //not final because minimum wage can change!
	private static int nameCount = 0; //create 4 instance variables to hold the information of an employee
	
	public Employee(){ //default employee constructor
		name = setDefaultName();
		salary = minimumWage;
	}
	public Employee(String name, double salary){ //employee constructor with a name and salary as parameters
		this.name = name;
		this.salary = salary;
	}
	private static String setDefaultName(){ //creates a static method that creates default employee names, starting at employee0
		String employeeNumber = String.valueOf(nameCount);
		String employeeName = "Employee" + employeeNumber;
		nameCount++;
		return employeeName;
	}
	
	public String getName(){ //returns the name of the employee
		return name;
	}
	public double getSalary(){ //returns the salary of the employee 
		return salary;
	}
	public void raiseSalary(double percent){ //increase the salary of the employee by a percentage
		salary = salary * ((percent/100) + 1);
	}
}
