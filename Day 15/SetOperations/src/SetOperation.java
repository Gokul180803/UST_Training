import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SetOperations {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static <T> boolean isSubset(Set<T> potentialSubset, Set<T> potentialSuperset) {
        return potentialSuperset.containsAll(potentialSubset);
    }
}

public class SetOperation {

	public static void main(String[] args) {
		 Set fruit1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
		 Set fruit2 = new HashSet<>(Arrays.asList("Banana", "Grape", "Apple"));
		 Set fruit3 = new HashSet<>(Arrays.asList("Apple", "Banana"));

      System.out.println("Union Set : "+SetOperations.union(fruit1,fruit2));
      System.out.println("Intersection Set : "+SetOperations.intersection(fruit1,fruit2));
      System.out.println("Difference Set : "+SetOperations.difference(fruit1,fruit2));
      System.out.println("isSubset Set : "+SetOperations.isSubset(fruit3,fruit1));
      System.out.println("isSubset Set : "+SetOperations.isSubset(fruit1,fruit3));

	}

}
