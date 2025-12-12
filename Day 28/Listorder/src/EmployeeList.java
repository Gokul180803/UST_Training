import java.util.ArrayList;
import java.util.List;

 class EmployeeList  {


	 public static List<Employee> getEmployees() {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1002, "Jane", 72000));
	        employees.add(new Employee(1001, "John", 55000));
	        employees.add(new Employee(1004, "Chris", 85000));
	        employees.add(new Employee(1010, "Sophia", 67000));
	        employees.add(new Employee(1007, "Emily", 35000));
	        employees.add(new Employee(1006, "Sarah", 92000));
	        employees.add(new Employee(1005, "Michael", 60000));
	        employees.add(new Employee(1008, "David", 46000));
	        employees.add(new Employee(1009, "Lucas", 79000));
	        return employees;
	    }

 }

