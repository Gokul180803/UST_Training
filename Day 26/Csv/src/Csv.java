import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Csv {
public static void main(String []args) throws IOException {
	String name="list.csv";
	 // Data to write to the CSV
    String[][] data = {
        {"Name", "Age", "Country"},
        {"John", "25", "USA"},
        {"Sara", "30", "Canada"},
        {"Anna", "22", "UK"}
    };
	try(BufferedWriter br =new BufferedWriter(new FileWriter(name)))
	{
		for(String row[]:data) {
			String rowline=String.join("|",row);
			br.write(rowline);
			br.newLine();
		}
		System.out.print("Created Successfully");
	}
}
}
