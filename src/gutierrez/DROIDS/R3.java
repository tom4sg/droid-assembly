package gutierrez.DROIDS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import gutierrez.ARMS.LeftArm;
import gutierrez.ARMS.RightArm;
import gutierrez.BODY.Chasis;
import gutierrez.BODY.SensorDome;
import gutierrez.ENUMS.Battery;
import gutierrez.ENUMS.Status;
import gutierrez.INTERFACES.Droidable;

public class R3 extends AstromechDroid {

	private Status R3Status;
	private Battery R3Battery;

	public R3(String serialNumber) {
		super(serialNumber);
		Chasis C = new Chasis(serialNumber);
		this.setChasis(C);
		C.setHeight(4);
		C.setWeight(400);
		
		SensorDome S = new SensorDome(serialNumber);
		this.setDome(S);
		S.setHeight(2);
		S.setWeight(200);
		
		this.R3Status = Status.ONLINE;
		this.R3Battery = Battery.R3;
		this.setHeight(C.getHeight() + S.getHeight());
		this.setWeight(C.getWeight() + S.getWeight());
		
		LeftArm L = new LeftArm();
		RightArm R = new RightArm();
		this.setLeftArm(L);
		this.setRightArm(R);
		
	}
		
	
	
		public Status getR3Status() {
		return R3Status;
	}



	public void setR3Status(Status r3Status) {
		R3Status = r3Status;
	}



	public Battery getR3Battery() {
		return R3Battery;
	}



	public void setR3Battery(Battery r3Battery) {
		R3Battery = r3Battery;
	}



		public void displayDroid() {
			System.out.println("R3 Droid \tHeight: " + getHeight() + "\tWeight: " + getWeight() + 
					"\nSerial Number   " + getSerialNumber() 
					+ "\nDome Serial Number-Status \t" + getDome().getSerialNumber() + "\t" + getDome().getStatus()
					+ "\nChasis Serial Number-Status \t" + getChasis().getSerialNumber() + "\t" + getChasis().getStatus()
					+ "\nLeft Arm Serial Number-Status \t" + getLeftArm().getSerialNumber() + "\t\t" + getLeftArm().getStatus()
					+ "\nRight Arm Serial Number-Status \t" + getRightArm().getSerialNumber() + "\t\t" + getRightArm().getStatus()
					+ "\nBattery: " + R3Battery
					+ "\nStatus: " + R3Status + "\n");
			}

		public void checkStatus() {
			if(R3Status == Status.ONLINE) {
			System.out.println("R3 Droid is ONLINE");
			}
			else {
			System.out.println("R3 Droid is OFFLINE");
			}
		}
		public void toFile() throws IOException {
			FileWriter FW = new FileWriter(Droidable.dir + "DroidData", true);
			BufferedWriter BW = new BufferedWriter(FW);
			BW.write("R3 Droid" + "\nSerial Number: " + getSerialNumber() 
			+ "\nHeight: " + getHeight() 
			+ "\nWeight: " + getWeight() 
			+ "\nBattery: " + getR3Battery()
			+ "\nStatus: " + getR3Status() 
			+ "\n" + "*".repeat(44) + "\n");
			BW.close();
		}

}
