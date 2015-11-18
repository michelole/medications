package at.medunigraz.imi.medications.model;

public class Medication {
	private String conceptID;
	private String termID;
	private String termLabel;
	private String termType;
	private String language;
	private boolean isPreferred;
	private String parentConceptID;
	private String mappingForms;
	
	private static final int DEFAULT_COUNTER = 1;
	protected static int counter = DEFAULT_COUNTER;
	
	public static void resetCounter() {
		Medication.counter = DEFAULT_COUNTER;
	}

	public Medication(String conceptID, String termID, String termLabel, String termType, String language,
			boolean isPreferred, String parentConceptID, String mappingForms) {
		super();
		this.conceptID = conceptID;
		this.termID = termID;
		this.termLabel = termLabel;
		this.termType = termType;
		this.language = language;
		this.isPreferred = isPreferred;
		this.parentConceptID = parentConceptID;
		this.mappingForms = mappingForms;
	}

	public Medication(String termLabel, boolean isPreferred) {
		super();
		this.conceptID = "ABDMDIMI" + String.format("%05d", counter++);
		this.termID = "";
		this.termLabel = termLabel;
		this.termType = "";
		this.language = "de";
		this.isPreferred = isPreferred;
		this.parentConceptID = "";
		this.mappingForms = "";
	}
	
	public Medication(String conceptID, String termLabel, boolean isPreferred) {
		super();
		this.conceptID = conceptID;
		this.termID = "";
		this.termLabel = termLabel;
		this.termType = "";
		this.language = "de";
		this.isPreferred = isPreferred;
		this.parentConceptID = "";
		this.mappingForms = "";
	}

	public String getConceptID() {
		return conceptID;
	}

	public String getTermID() {
		return termID;
	}

	public String getTermLabel() {
		return termLabel;
	}

	public String getTermType() {
		return termType;
	}

	public String getLanguage() {
		return language;
	}

	public boolean isPreferred() {
		return isPreferred;
	}

	public String getParentConceptID() {
		return parentConceptID;
	}

	public String getMappingForms() {
		return mappingForms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conceptID == null) ? 0 : conceptID.hashCode());
		result = prime * result + (isPreferred ? 1231 : 1237);
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((mappingForms == null) ? 0 : mappingForms.hashCode());
		result = prime * result + ((parentConceptID == null) ? 0 : parentConceptID.hashCode());
		result = prime * result + ((termID == null) ? 0 : termID.hashCode());
		result = prime * result + ((termLabel == null) ? 0 : termLabel.hashCode());
		result = prime * result + ((termType == null) ? 0 : termType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medication other = (Medication) obj;
		if (conceptID == null) {
			if (other.conceptID != null)
				return false;
		} else if (!conceptID.equals(other.conceptID))
			return false;
		if (isPreferred != other.isPreferred)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (mappingForms == null) {
			if (other.mappingForms != null)
				return false;
		} else if (!mappingForms.equals(other.mappingForms))
			return false;
		if (parentConceptID == null) {
			if (other.parentConceptID != null)
				return false;
		} else if (!parentConceptID.equals(other.parentConceptID))
			return false;
		if (termID == null) {
			if (other.termID != null)
				return false;
		} else if (!termID.equals(other.termID))
			return false;
		if (termLabel == null) {
			if (other.termLabel != null)
				return false;
		} else if (!termLabel.equals(other.termLabel))
			return false;
		if (termType == null) {
			if (other.termType != null)
				return false;
		} else if (!termType.equals(other.termType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medication [conceptID=" + conceptID + ", termID=" + termID + ", termLabel=" + termLabel + ", termType="
				+ termType + ", language=" + language + ", isPreferred=" + isPreferred + ", parentConceptID="
				+ parentConceptID + ", mappingForms=" + mappingForms + "]";
	}

}
