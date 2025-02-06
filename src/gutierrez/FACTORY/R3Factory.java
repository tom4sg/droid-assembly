package gutierrez.FACTORY;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import gutierrez.DROIDS.AstromechDroid;
import gutierrez.DROIDS.R3;
import gutierrez.INTERFACES.Droidable;

public class R3Factory extends DroidFactory {

	public R3Factory(String factoryID) {
		super(factoryID);
	}
	
	public boolean buildDroids(int count) throws IOException {
		ArrayList<AstromechDroid> droidStorage = new ArrayList<>();
		FileWriter FW = new FileWriter(Droidable.dir + "DroidData");
		BufferedWriter BW = new BufferedWriter(FW);
		for(int i = 0;i < count;i++) {
			R3 droid = new R3(Droidable.generateR3SerialNumber());
			droidStorage.add(droid);
			BW.write("R3 Droid" + "\nSerial Number: " + droid.getSerialNumber() + "\nHeight: " + droid.getHeight() + "\nWeight: " + droid.getWeight() 
			+ "\nBattery: " + droid.getR3Battery()
			+ "\nStatus: " + droid.getR3Status() + "\n" + "*".repeat(44) + "\n");
			
			}
		BW.close();
		setDroidStorage(droidStorage);
		return true;
		
	}
	
	public void displayDroids() {
		for(AstromechDroid d: getDroidStorage()) {
			d.displayDroid();
			}
		System.out.println();
		}

	}
