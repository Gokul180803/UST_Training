package com.example.company;

public class Manager extends Employee {

	public String projectName;
	
	public Manager(String name, int employeeId, String department, double salary,String projectName) {
		super(name, employeeId, department, salary);
		this.projectName=projectName;
		
	}
	public void displayManagerDetails() {
        System.out.println("Manager Info: " + getEmployeeDetails());
		System.out.println("Manager Department: " + department);
        System.out.println("Project: " + projectName);
	}

}
