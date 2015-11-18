package at.medunigraz.imi.medications.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;

public class CSVWriter {

	private static final String[] HEADER = { "ConceptID", "TermID", "TermLabel", "TermType", "Language", "isPreferred",
			"parentConceptIDs", "MappingForms" };
	
	private static final char DELIMITER = ';';
	private static final QuoteMode QUOTE_MODE = QuoteMode.ALL;
	private static final String LINE_SEPARATOR = "\n";

	private String outputFile;

	public CSVWriter(String outputFile) {
		super();
		this.outputFile = outputFile;
	}

	public void write(List<Medication> medications) {
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader(HEADER).withDelimiter(DELIMITER).withQuoteMode(QUOTE_MODE).withRecordSeparator(LINE_SEPARATOR);
		CSVPrinter csvPrinter;
		try {
			csvPrinter = new CSVPrinter(new FileWriter(outputFile), csvFormat);

			for (Medication med : medications) {
				List<String> data = new ArrayList<String>();
				data.add(med.getConceptID());
				data.add(med.getTermID());
				data.add(med.getTermLabel());
				data.add(med.getTermType());
				data.add(med.getLanguage());
				data.add(med.isPreferred() ? "1" : "0");
				data.add(med.getParentConceptID());
				data.add(med.getMappingForms());
				csvPrinter.printRecord(data);
			}

			csvPrinter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
