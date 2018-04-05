/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Apr 2018
 * Created for: learning
 * 
 * This program is a sub-blueprint of 'Vehicle'
 ****************************************************************************/

//Jet is the sub-class of Vehicle
public class Truck extends Vehicle {
	//class for truck
	
	public static final double MULTIPLIER = 0.4; 
	
	public Truck(String plate, String colour) throws Exception {
		super(plate, colour); 
		 _numberOfDoors = 2;
		 _numberOfTires = 8;
		
	}

	public void Accelerate(double speed) {
		super.Accelerate(speed*MULTIPLIER);
	}
	
	public void Decelerate(double speed) {
		super.Decelerate(speed*MULTIPLIER); 
	}
}
