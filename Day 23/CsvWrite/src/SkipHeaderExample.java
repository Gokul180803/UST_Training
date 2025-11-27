import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SkipHeaderExample {
    public static void main(String[] args) {
        String csvFile = "output.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the first line (header)
            br.readLine();

            // Process remaining lines
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
