package gutierrez.ENUMS;

public enum Limb {
	Upper("Upper",1),
	Lower("Lower",2);
	
	private String type;
	private int value;
	
	
	private Limb(String type, int value) {
		this.type = type;
		this.value = value;
	}

}
