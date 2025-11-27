import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVWithBufferedReader {
    public static void main(String[] args) {
        String fileName = "input.csv"; // File in project root

        // Use try-with-resources to ensure BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read each line until end of file
            while ((line = br.readLine()) != null) {
                // Split line by comma
                String[] values = line.split(",");

                // Print each column value
                System.out.println("Name: " + values[0] 
                                 + ", Age: " + values[1] 
                                 + ", City: " + values[2]);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
