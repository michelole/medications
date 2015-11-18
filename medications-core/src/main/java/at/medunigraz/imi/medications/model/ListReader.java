package at.medunigraz.imi.medications.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListReader {
	private String inputFile;

	public ListReader(String inputFile) {
		super();
		this.inputFile = inputFile;
	}

	public List<Medication> read() {
		List<Medication> medications = new ArrayList<Medication>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(inputFile)));

			String line = "";
			while ((line = br.readLine()) != null) {
				medications.addAll((new InputLine(line)).getMedications());
			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return medications;
	}

}
