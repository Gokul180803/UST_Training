import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVExample {
    public static void main(String[] args) {
        String csvFile = "sample_data.csv"; // path to your CSV file
        String line;
        String csvSplitBy = ","; // delimiter

        try (BufferedReader br = new BufferedReader(new FileReader("sample_data.csv"))) {
            while ((line = br.readLine()) != null) {
                // split line into columns
                String[] data = line.split(csvSplitBy);
                System.out.println("Type: " + data[0] + ", Price: " + data[1] + ", Date: " + data[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
