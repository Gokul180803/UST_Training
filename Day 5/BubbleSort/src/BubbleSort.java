import java.util.Arrays;

class ArraySorter{
	public static void selectionSort(int []arr) {
		int n=arr.length;
		 for (int i = 0; i < n - 1; i++) {
	            int minIdx = i;

	            // Find the minimum element in the unsorted part
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIdx]) {
	                    minIdx = j;
	                }
	            }

	            // Swap the found minimum with the first unsorted element
	            int temp = arr[minIdx];
	            arr[minIdx] = arr[i];
	            arr[i] = temp;
	        }
	}
	
	 public static void bubbleSort(int[] arr) {
		 boolean swapped;
		 int n=arr.length;
		 for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                  
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            
	            // If no two elements were swapped in inner loop, array is sorted
	            if (!swapped) break;
	 }
	 }
}
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] data = {5, 1, 4, 2, 8};
		int[] data1 = {54, 12, 14, 2, 89};
		int[] data2 = {5, 1, 4, 2, 8};
		
		int[] data3 = {20, -5, 0, 15, 10};
		System.out.println("----Bubble Sort-----");
		System.out.println("Original array: " + Arrays.toString(data));
		ArraySorter.bubbleSort(data);
		System.out.println("Sorted array: " + Arrays.toString(data));
		System.out.println("----Selection Sort-----");
		System.out.println("Original array: " + Arrays.toString(data1));
		ArraySorter.selectionSort(data1);
		System.out.println("Sorted array: " + Arrays.toString(data1));
		System.out.println("----Bubble Sort-----");
		System.out.println("Original array: " + Arrays.toString(data2));
		ArraySorter.bubbleSort(data2);
		System.out.println("Sorted array: " + Arrays.toString(data2));
		System.out.println("----Selection Sort-----");
		System.out.println("Original array: " + Arrays.toString(data3));
		ArraySorter.selectionSort(data3);
		System.out.println("Sorted array: " + Arrays.toString(data3));


	}

}
