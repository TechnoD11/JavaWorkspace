/**
 * 
 * @author Derek Wider
 *
 */
public class EmployeeTester {

	public static void main(String[] args) { //main method
		Employee bill = new Employee(); //creates a new employee
		System.out.println("Bill's name is: " + bill.getName() + "\nExpected: Employee0"); // prints his default name
		System.out.println("Bill's salary is: $" + bill.getSalary() + "\nExpected: $8.00 (Minimum wage)"); //prints his default wage
		
		Employee bob = new Employee(); //creates another employee
		System.out.println("Bob's name is: " + bob.getName() + "\nExpected: Employee1"); //prints his default name
		System.out.println("Bob's salary is: $" + bob.getSalary() + "\nExpected: $8.00 (Minimum wage)"); //prints his default wage
		
		Employee sam = new Employee("Sam", 14.00); //creates yet another employee
		System.out.println("Sam's name is: " + sam.getName() + "\nExpected: Sam"); //prints his constructed name
		System.out.println("Sam's salary is: $" + sam.getSalary() + "\nExpected: $14.00"); //prints his constructed wage
		
		bill.raiseSalary(10); //raise's bill's salary by 10%
		System.out.println("Bill got a raise! His new salary is: $" + bill.getSalary() + "\nExpected: $8.80"); //print's bill's new salary after a 10% raise

	}

}
