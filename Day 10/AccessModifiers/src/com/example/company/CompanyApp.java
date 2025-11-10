package com.example.company;

public class CompanyApp {

	public static void main(String[] args) {
		
	
		Employee emp = new Employee("Alice", 101, "Sales", 60000.0);
		Manager mgr = new Manager("Bob", 201, "IT", 90000.0, "Project X");

        // Attempting direct access
        // System.out.println(emp.name);         //  Error: 'name' is private
        // System.out.println(emp.department);
		 System.out.println(emp.employeeId);     
	        System.out.println(emp.salary);         
	        // System.out.println(emp.calculateAnnualBonus()); //  Error: private method not accessible

	      
	        System.out.println(emp.getEmployeeDetails());     
	        emp.displaySalaryInfo();                         
	        mgr.displayManagerDetails();                     
	    }
	}


