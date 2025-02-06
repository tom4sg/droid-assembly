package gutierrez.ENUMS;

public enum Radar {
	
	R4R("Doppler",500);
	
	private String type;
	private int range;
	
	private Radar(String type, int range) {
		this.type = type;
		this.range = range;
	}
	
	

}
