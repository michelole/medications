package at.medunigraz.imi.medications;

import at.medunigraz.imi.medications.model.CSVWriter;
import at.medunigraz.imi.medications.model.ListReader;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String inputFile = "src/main/resources/medications_list_example.txt";
		String outputFile = "src/main/resources/medications.csv";

		(new CSVWriter(outputFile)).write(new ListReader(inputFile).read());
	}
}
