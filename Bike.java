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
	//class for bike
	
	public Bike(String plate, String colour) throws Exception {
		 super(plate, colour);
		//Constructor override
		 
		 _licensePlateNumber= "";
		 _numberOfDoors= 0;
		 _numberOfTires = 2;
		 _maximumSpeed = 20;			
			
		//super.setLicensePlate("");
		//super.setNumberOfDoors(0);
		//super.setNumberOfTires(2);
	}
	
	public void Accelerate(double speed) {
		super.Accelerate(speed);
	}
	
	public void Decelerate(double speed) {
		super.Decelerate(_speed); //sudden break
	}
	

	protected String All() {
		return ("	Colour:"+_colour +"	Number of doors:"+_numberOfDoors+"	Number of tires:"+_numberOfTires+"	Speed:"+_speed+"km/h");
	}
	
}



