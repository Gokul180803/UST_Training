public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 500_000;

        // -------------------------------
        // Method 1: String concatenation with '+'
        // -------------------------------
        long startTimeConcat = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str = str + "a";  // inefficient: creates new String each time
        }
        long endTimeConcat = System.nanoTime();
        long durationConcat = endTimeConcat - startTimeConcat;

        // -------------------------------
        // Method 2: StringBuilder append
        // -------------------------------
        long startTimeBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");  // efficient: modifies buffer directly
        }
        String result = sb.toString(); // final conversion
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

       
        System.out.println("Iterations: " + iterations);
        System.out.println("String (+) concatenation time: " + durationConcat / 1_000_000 + " ms");
        System.out.println("StringBuilder append time:    " + durationBuilder / 1_000_000 + " ms");
    }
}
