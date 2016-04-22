import java.io.*;

public class Employee{
	String name;
	int age;
	String designation;
	double salary;

	// Constructor for the class Employee
	public Employee(String name){
		this.name = name;
	}

	// Method to assign age of Employee
	public void empAge(int empAge){
		age = empAge;
	}

	// Method to assign designation of Employee
	public void empDesignation(String empDesig){
		designation = empDesig;
	}

	// Method to assign salary of Employee
	public void empSalary(double empSalary){
		salary = empSalary;
	}

	/* Print the Employee details */
   public void printEmployee(){
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}