package gutierrez.DROIDS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import gutierrez.ARMS.LeftArm;
import gutierrez.ARMS.RightArm;
import gutierrez.BODY.Chasis;
import gutierrez.BODY.SensorDome;
import gutierrez.ENUMS.Battery;
import gutierrez.ENUMS.Radar;
import gutierrez.ENUMS.Status;
import gutierrez.INTERFACES.Droidable;

public class R4 extends AstromechDroid {
	
	private Status R4Status;
	private Battery R4Battery;
	private Radar R4Radar;

	public R4(String serialNumber) {
		super(serialNumber);
		Chasis C = new Chasis(serialNumber);
		this.setChasis(C);
		C.setHeight(5);
		C.setWeight(500);
		
		SensorDome S = new SensorDome(serialNumber);
		this.setDome(S);
		S.setHeight(2);
		S.setWeight(150);
		
		this.R4Status = Status.ONLINE;
		this.R4Battery = Battery.R4;
		this.R4Radar = Radar.R4R;
		this.setHeight(C.getHeight() + S.getHeight());
		this.setWeight(C.getWeight() + S.getWeight());
		
		LeftArm L = new LeftArm();
		RightArm R = new RightArm();
		this.setLeftArm(L);
		this.setRightArm(R);
		
	}
	
	
		
		public Status getR4Status() {
		return R4Status;
	}



	public void setR4Status(Status r4Status) {
		R4Status = r4Status;
	}



	public Battery getR4Battery() {
		return R4Battery;
	}



	public void setR4Battery(Battery r4Battery) {
		R4Battery = r4Battery;
	}



	public Radar getR4Radar() {
		return R4Radar;
	}



	public void setR4Radar(Radar r4Radar) {
		R4Radar = r4Radar;
	}



		public void displayDroid() {
			System.out.println("R4 Droid \tHeight: " + getHeight() + "\tWeight: " + getWeight() + 
					"\nSerial Number   " + getSerialNumber() 
					+ "\nDome Serial Number-Status \t" + getDome().getSerialNumber() + "\t" + getDome().getStatus()
					+ "\nChasis Serial Number-Status \t" + getChasis().getSerialNumber() + "\t" + getChasis().getStatus()
					+ "\nLeft Arm Serial Number-Status \t" + getLeftArm().getSerialNumber() + "\t\t" + getLeftArm().getStatus()
					+ "\nRight Arm Serial Number-Status \t" + getRightArm().getSerialNumber() + "\t\t" + getRightArm().getStatus()
					+ "\nBattery: " + R4Battery
					+ "\nStatus: " + R4Status 
					+ "\nRadar: " + R4Radar +"\n");
			}

		public void checkStatus() {
			if(R4Status == Status.ONLINE) {
				System.out.println("R4 Droid is ONLINE");
				}
				else {
				System.out.println("R4 Droid is OFFLINE");
				}
		}
		public void toFile() throws IOException {
			FileWriter FW = new FileWriter(Droidable.dir + "DroidData", true);
			BufferedWriter BW = new BufferedWriter(FW);
			BW.write("R4 Droid" + "\nSerial Number: " + getSerialNumber() 
			+ "\nHeight: " + getHeight() 
			+ "\nWeight: " + getWeight() 
			+ "\nBattery: " + getR4Battery()
			+ "\nStatus: " + getR4Status() 
			+ "\nRadar: " + getR4Radar() + "\n" + "*".repeat(44) + "\n");
			BW.close();
		}

}
