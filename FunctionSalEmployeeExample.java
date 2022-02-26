package Shinde;

import java.util.Scanner;
import java.util.function.Function;

class Employee{
	
	String name;
	String desg;
	int salary;
	public Employee(String name, String desg, int salary) {
		super();
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}
	public void printInfo() {
		System.out.println(" Name "+name+" desg "+desg+" salary "+salary);
		
	}
	
}

public class FunctionSalEmployeeExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Function<Employee, Employee> f= emp ->{
			if (emp.desg.equalsIgnoreCase("Manager")) 
				emp.salary=emp.salary+1000;
			else if (emp.desg.equalsIgnoreCase("clerk"))
				emp.salary=emp.salary+500;
			else if (emp.desg.equalsIgnoreCase("Salesman"))
				emp.salary=emp.salary+350;
			return emp;
				
		};
		System.out.println("Enter Name");
		String name= sc.next();
		System.out.println("Enter Designation");
		String desg= sc.next();
		System.out.println("Enter salary");
		int salary= sc.nextInt();
		Employee temp= new Employee(name, desg, salary);
		temp.printInfo();
		Employee e=f.apply(temp);
		System.out.println("After updated...");
		e.printInfo();
		
	}
	

}
