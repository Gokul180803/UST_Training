

	
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.List;
		import java.util.Random;

		class Employee {
		    private int id;
		    private String name;
		    private double salary;

		    // Constructor
		    public Employee(int id, String name, double salary) {
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		    }

		    // Getters
		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    // Method to display Employee details
		    @Override
		    public String toString() {
		        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
		    }

	}

