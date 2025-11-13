 class Box<T> {
    private T item; // 2. Private field of type T

    // 3. Constructor to initialize the item
    public Box(T item) {
        this.item = item;
    }

    // 4. Getter method
    public T getItem() {
        return item;
    }

    // 5. Setter method
    public void setItem(T item) {
        this.item = item;
    }

    // 6. Override toString() to return string representation
    @Override
    public String toString() {
        return "Box contains: " + item;
    }
 }

 class ArrayUtils{
	 public static <T> void printArray(T[] arr) {
		 for(T E:arr) {
			 System.out.print(E+" ");
		 }
	 }
 }
 public class Array {

	    public static void main(String[] args) {
	        Box<Integer> integerBox = new Box<>(123);
	        System.out.println(integerBox.toString());

	        Box<String> stringBox = new Box<>("Hello Generics");
	        System.out.println(stringBox.toString());

	        // Demonstrate setItem() method
	        stringBox.setItem("Updated Generics");
	        System.out.println("After update: " + stringBox.toString());

	        Integer[] intArray = {1, 5, 9, 13};
	        ArrayUtils.printArray(intArray); // print int array
	        System.out.println();

	        String[] stringArray = {"apple", "banana", "cherry"};
	        ArrayUtils.printArray(stringArray); // print string array
	    }
	}
