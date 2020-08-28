package constructor.com;

import java.util.Scanner;

public class Employee {
	
	// Variables 
    private String employeeName;
    private String title = "Junior";
    private double salary = 0;
    private double hoursWorked = 0;
    
    public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	
    
    // Constructor
    Employee() {
    	System.out.print("Enter employee name: " + "\n");
    	Scanner sc = new Scanner(System.in);
    	this.employeeName = sc.next();
    	
    	
    	System.out.println("Employee titles are: " + "\n" + "-Junior" + "\n" + "-Medior" + "\n" + "-Senior");
    	
    	System.out.print("Enter employee title: " + "\n");
    	this.title = sc.next();
    	
    	System.out.print("Enter employee working hours: " + "\n");
    	this.hoursWorked = sc.nextDouble();
    	
    }
    
    // Calculations
    public double salaryCalc() {
    	if(hoursWorked <= 500) {
    		salary = 600;
    	}
    	else if(hoursWorked > 500 && hoursWorked < 1000) {
    		salary = 1200;
    	}
    	
    	else {
    		salary = 2000;
    	}
    	
    	return salary;
    }
    
    
}
