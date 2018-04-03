/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Apr 2018
 * Created for: learning
 * 
 * This program is a sub-blueprint of 'Vehicle'
 ****************************************************************************/

//Jet is the sub-class of Vehicle
public class Bike extends Vehicle {
	//Jet inherits all of Airplane's behaviour to use for its own
	
	public static final double MULTIPLIER = 0.8; //less speed
	
	
	//subclass can add its own variables to the ones that it inherits from Airplane 
	
	public Bike(String plate, String colour) throws Exception {
		 super(plate, colour); //refers to class this class has inherited behaviour from
		//this calls the constructor of Airplane
		super.setNumberOfDoors(0);
	}
	
	public void Accelerate(double speed) {
		//subclass can call superclass's methods, as well as changing its behaviour(OVERRIDING).
		super.Accelerate(speed* MULTIPLIER);
	}
	
	public void Deccelerate(double speed) {
		super.Decelerate(speed* MULTIPLIER * 2); //can also call it super.getSpeed()
	}
	
	//eventhough not written
	//getSpeed() can be used for Jet since it has inherited it from Airplane
}