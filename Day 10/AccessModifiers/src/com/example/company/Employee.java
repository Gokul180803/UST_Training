package com.example.company;

public class Employee {

	protected String name;
	int employeeId;
	protected String department;
	public double salary;
	public Employee(String name,int employeeId,String department,double salary){
		this.name=name;
		this.employeeId=employeeId;
		this.department=department;
		this.salary=salary;
	}
	public String getEmployeeDetails() {
        return "Name: " + name + ", ID: " + employeeId;
    }
	private Double calculateAnnualBonus() {
		return this.salary * 0.10;
		
	}
	 public void displaySalaryInfo() {
	        double bonus = calculateAnnualBonus(); // Allowed: private method accessed within class
	        System.out.println("Employee: " + name + ", Salary: " + salary + ", Bonus: " + bonus);
	    }
	

}
