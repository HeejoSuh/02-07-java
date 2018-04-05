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
	//Jet inherits all of Airplane's behaviour to use for its own
	
	public static final double MULTIPLIER = 0.4; 
	//subclass can add its own variables to the ones that it inherits from Airplane 
	
	public Truck(String plate, String colour) throws Exception {
		super(plate, colour); //refers to class this class has inherited behaviour from
		//this calls the constructor of Airplane
		super.setNumberOfDoors(2);
		
	}

	public void Accelerate(double speed) {
		//subclass can call superclass's methods, as well as changing its behaviour(OVERRIDING).
		super.Accelerate(speed*MULTIPLIER);
	}
	
	public void Deccelerate(double speed) {
		super.Decelerate(speed*MULTIPLIER); //can also call it super.getSpeed()
	}
	
	//eventhough not written
	//getSpeed() can be used for Jet since it has inherited it from Airplane
}