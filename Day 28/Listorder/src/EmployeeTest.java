
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void testEmployeeSortOrderAndSize() {
    	List<Employee> employees = EmployeeList2.getEmployees2();

        assertEquals(9, employees.size());
    }

    @Test
    void testFilterEmployeesAboveSalary() {
    	List<Employee> employees =EmployeeList2.getEmployees2();
    	
	       
	        assertEquals("Chris",employees.get(0).getName());
	        assertEquals("Jane",employees.get(1).getName());

	        assertEquals("John",employees.get(2).getName());

	        assertEquals("Lucas",employees.get(3).getName());

	        assertEquals("Michael",employees.get(4).getName());

	        assertEquals("Sophia",employees.get(5).getName());

	        assertEquals("Sarah",employees.get(6).getName());

	        
      
    }
}
