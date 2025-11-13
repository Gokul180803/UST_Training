import java.util.List;

class CollectionUtilities {

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty.");
        }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}


public class BoundedType {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 9, 5);
        System.out.println("Max Integer: " + CollectionUtilities.findMax(numbers));

        List<String> words = List.of("apple", "zebra", "banana");
        System.out.println("Max String: " + CollectionUtilities.findMax(words));
	}

}
