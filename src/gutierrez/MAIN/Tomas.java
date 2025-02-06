package gutierrez.MAIN;

import java.io.IOException;

import gutierrez.FACTORY.R3Factory;
import gutierrez.FACTORY.R4Factory;

public class Tomas {

	public static void main(String[] args) throws IOException {
		
		R3Factory R3 = new R3Factory("GR3");
		R3.buildDroids(2);
		R3.displayDroids();
		System.out.println("***********");
		System.out.println();
		R4Factory R4 = new R4Factory("GR4");
		R4.buildDroids(2);
		R4.displayDroids();	

	}

}
