package at.medunigraz.imi.medications.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class InputLine {
	private String line;

	private static final Pattern WHITESPACE = Pattern.compile("\\s+");

	public InputLine(String line) {
		super();
		this.line = line;
	}

	public List<Medication> getMedications() {
		List<Medication> medList = new ArrayList<Medication>();
		if (line.isEmpty())
			return medList;

		String[] labels = WHITESPACE.split(line);
		if (labels.length == 0)
			return medList;

		Medication preferred = new Medication(labels[0], true);
		medList.add(preferred);

		String conceptID = preferred.getConceptID();
		for (int i = 1; i < labels.length; i++) {
			medList.add(new Medication(conceptID, labels[i], false));
		}
		
		return medList;
	}
}
