package gutierrez.INTERFACES;

public interface Droidable {
	
	public static String dir = "src/gutierrez/DROID_DATA/";
			public abstract void displayDroid();
			public static String generateR3SerialNumber() {
				int min = 1; int max = 10;
				String sN = "R3-";
				for(int i = 0; i < 3;i++) {
					sN += String.valueOf( (int)(Math.random() * (max - min) + min));
				}
				return sN;
			}
			public static String generateR4SerialNumber() {
				int min = 1; int max = 10;
				String sN = "R4-";
				for(int i = 0; i < 4;i++) {
					sN += String.valueOf( (int)(Math.random() * (max - min) + min));
				}
				return sN;
			}

}
