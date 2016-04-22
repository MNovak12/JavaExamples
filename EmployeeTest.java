import java.io.*;

public class EmployeeTest{
	public static void main(String args[]){
		// Create two objects using constructor
		Employee emp = new Employee("Marissa Novak");

		// Call methods to set age, designation, salary for each
		emp.empAge(22);
		emp.empDesignation("Software Engineer");
		emp.empSalary(90000);
		emp.printEmployee();
	}
}