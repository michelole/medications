package at.medunigraz.imi.medications.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class InputLineTest extends TestCase {

	@Test
	public void testGetMedications() {
		List<Medication> expected, actual;

		// General case
		Medication.resetCounter();
		expected = new ArrayList<Medication>(2);
		expected.add(new Medication("ABDMDIMI00001", "MedicationA", true));
		expected.add(new Medication("ABDMDIMI00001", "MedicationB", false));
		Medication.resetCounter();
		actual = (new InputLine("MedicationA MedicationB")).getMedications();
		assertEquals(expected, actual);

		// Empty line
		expected = new ArrayList<Medication>();
		Medication.resetCounter();
		actual = (new InputLine("")).getMedications();
		assertEquals(expected, actual);

		// Line with a single space
		expected = new ArrayList<Medication>();
		Medication.resetCounter();
		actual = (new InputLine(" ")).getMedications();
		assertEquals(expected, actual);
	}

}
