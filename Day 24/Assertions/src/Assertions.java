class StringUtility {
    public static String reverseString(String str) {
        // Pre-condition Assertion: Ensure the input string is not null
        assert str != null : "Input string cannot be null";

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Post-condition Assertion (Length): Ensure the length of the reversed string is the same as the original
        assert reversed.length() == str.length() : "Reversed string length does not match original length";

        // Post-condition Assertion (Idempotence Check): Ensure double reversal returns the original string
        assert reverseString(reversed).equals(str) : "Double reversal failed to return the original string";

        return reversed;
    }

    public static void main(String[] args) {
        // Test cases for the reverseString method

        // Valid inputs
        System.out.println(reverseString("hello"));  // Expected: "olleh"
        System.out.println(reverseString("Java"));   // Expected: "avaJ"
        System.out.println(reverseString("madam"));  // Expected: "madam" (Palindrome)
        System.out.println(reverseString("a"));      // Expected: "a"
        System.out.println(reverseString(""));       // Expected: ""

      //  System.out.println(reverseString(null)); // Expected: Assertion error
    }
}
