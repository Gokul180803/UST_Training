
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class ListProcessor {

    public double sumOfList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();  // Converts the number to a double and adds it to sum
        }
        return sum;
    }
    public void addIntegersToList(List<? super Integer> destination, List<Integer> source) {
        destination.addAll(source);  // Adds all elements from source to destination
}
    public void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");  // Prints each element followed by a space
        }
        System.out.println();  // Prints a newline after all elements
    }
}






 public class WildCard {

	    public static void main(String[] args) {
	        ListProcessor processor = new ListProcessor();

	        // Test with List<Integer>
	        List<Integer> intList = List.of(3, 7, 2, 9, 5);
	        System.out.println("Sum of Integer list: " + processor.sumOfList(intList));

	        // Test with List<Double>
	        List<Double> doubleList = List.of(2.5, 3.7, 1.2);
	        System.out.println("Sum of Double list: " + processor.sumOfList(doubleList));

	        // Test with List<Number>
	        List<Number> numberList = List.of(10, 20.5, 30L);
	        System.out.println("Sum of Number list: " + processor.sumOfList(numberList));

	        // Test addIntegersToList with List<Number>
	        List<Number> destinationNumber = new ArrayList<>();
	        processor.addIntegersToList(destinationNumber, intList);
	        System.out.print("Destination (Number) after adding Integers: ");
	        processor.printList(destinationNumber);

	        // Test addIntegersToList with List<Object>
	        List<Object> destinationObject = new ArrayList<>();
	        processor.addIntegersToList(destinationObject, intList);
	        System.out.print("Destination (Object) after adding Integers: ");
	        processor.printList(destinationObject);

	        // Test printList with List<String>
	        List<String> strList = Arrays.asList("Java", "Python", "C++");
	        System.out.print("String list: ");
	        processor.printList(strList);
	    }
	}
