import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteCSVExample {
    public static void main(String[] args) {
        String csvFile = "output.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
            // Write header
            writer.write("type,price,date");

            // Write sample rows
            writer.write("Furniture,213.37,2024-12-13");
            writer.write("Beauty,298.37,2025-09-13");
            writer.write("Groceries,226.66,2025-02-13");
            writer.write("Sports,65.20,2024-12-01");
            writer.write("Clothing,79.13,2025-04-24");

            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
