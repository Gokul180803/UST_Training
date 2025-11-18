
public class StringAPI {

	public static void main(String[] args) {

        String rawMessage = " * Hello World! This is a secret message. Code: XYZ-789. Do not share! * ";		 
		
		String CleanedCode=rawMessage.trim();
		if(CleanedCode.startsWith("*")&&CleanedCode.endsWith("*")) {
			CleanedCode = CleanedCode.substring(1, CleanedCode.length() - 1).trim();
			
		}
		 System.out.println("Cleaned Message: " + CleanedCode);

	        // 2. Extract and Transform Information
	        // Print length
	        System.out.println("Length: " + CleanedCode.length());

	        // Convert to uppercase
	        System.out.println("Uppercase: " + CleanedCode.toUpperCase());

	        // Find first index of "secret"
	        int secretIndex = CleanedCode.indexOf("secret");
	        System.out.println("Index of 'secret': " + secretIndex);
	        System.out.println(CleanedCode.contains("Code:"));
	        int StartIndex=CleanedCode.indexOf("Code:")+"Code:".length();
	        int endIndex=CleanedCode.indexOf(".",StartIndex);
	        
	        System.out.println(CleanedCode.substring(StartIndex,endIndex).trim());
	        String modifiedMessage = CleanedCode.replace("secret", "confidential");
	        System.out.println("Modified Message: " + modifiedMessage);

	        // Verify if cleanedMessage starts with "Hello World!"
	        boolean startsWithHello = CleanedCode.startsWith("Hello World!");
	        System.out.println("Starts with 'Hello World!': " + startsWithHello);
	}

}
