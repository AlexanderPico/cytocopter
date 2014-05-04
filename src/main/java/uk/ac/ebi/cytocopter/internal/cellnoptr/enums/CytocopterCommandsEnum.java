package uk.ac.ebi.cytocopter.internal.cellnoptr.enums;

public enum CytocopterCommandsEnum {
	CONFIGURE("configure"),
	PREPROCESS("preprocess"),
	OPTIMISE("optimise"),
	NODETYPE("node type");
	
	public static final String CYTOCOPTER_NAME_SPACE = "cytocopter";
	
	private String name;
	
	private CytocopterCommandsEnum (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
}
