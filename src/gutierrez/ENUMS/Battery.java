package gutierrez.ENUMS;

public enum Battery {
	
	R3("Lithium",1000),
	R4("Trithium",2000);
	
	private String type;
	private int amps;
	
	
	private Battery(String type, int amps) {
		this.type = type;
		this.amps = amps;
	}

}
