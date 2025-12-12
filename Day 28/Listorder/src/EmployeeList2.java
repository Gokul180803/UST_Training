import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class EmployeeList2  {
public static List<Employee> getEmployees2() {
    List<Employee> employees = EmployeeList.getEmployees();
    
    //employees.stream().filter(s->s.getSalary()>50000).sorted().collect(Collectors.toList());

    
	return employees;
   
}

 
public static void main(String[]args)
{
	List<Employee> order =EmployeeList.getEmployees();

}
}
	


