import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        // Use try-with-resources to ensure resources are closed automatically
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            
            // Write 1000 lines to the file
            for (int i = 1; i <= 1000; i++) {
                writer.write("This is line number " + i + ".");
                writer.newLine(); // Ensures each line is written on a new line
            }
            
            System.out.println("File 'log.txt' created successfully with 1000 lines.");
            
        } catch (IOException e) {
            // Handle IOException
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
