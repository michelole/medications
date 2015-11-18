package at.medunigraz.imi.medications;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import at.medunigraz.imi.medications.model.InputLine;
import at.medunigraz.imi.medications.model.Medication;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String inputFile = "src/main/resources/medications_list_example.txt";

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(inputFile)));

			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				List<Medication> medications = (new InputLine(line)).getMedications();
				for (Medication medication : medications) {
					System.out.println(medication);
				}
			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
