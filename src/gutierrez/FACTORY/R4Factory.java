package gutierrez.FACTORY;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import gutierrez.DROIDS.AstromechDroid;
import gutierrez.DROIDS.R3;
import gutierrez.DROIDS.R4;
import gutierrez.INTERFACES.Droidable;

public class R4Factory extends DroidFactory {
	
	public R4Factory(String factoryID) {
		super(factoryID);
	}
	
	public boolean buildDroids(int count) throws IOException {
		ArrayList<AstromechDroid> droidStorage = new ArrayList<>();
		FileWriter FW = new FileWriter(Droidable.dir + "DroidData", true);
		BufferedWriter BW = new BufferedWriter(FW);
		for(int i = 0;i < count;i++) {
			R4 droid = new R4(Droidable.generateR4SerialNumber());
			droidStorage.add(droid);
			BW.write("R4 Droid" + "\nSerial Number: " + droid.getSerialNumber() + "\nHeight: " + droid.getHeight() + "\nWeight: " + droid.getWeight() 
			+ "\nBattery: " + droid.getR4Battery()
			+ "\nStatus: " + droid.getR4Status() + "\nRadar: " + droid.getR4Radar() + "\n" + "*".repeat(44) + "\n");
			
			}
		BW.close();
		setDroidStorage(droidStorage);
		return true;
	}
	
	public void displayDroids() {
		for(AstromechDroid d: getDroidStorage()) {
			d.displayDroid();
		}
		
	}

}
