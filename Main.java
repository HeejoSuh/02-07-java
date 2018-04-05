/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This program uses the stack 'Vehicle',
 * a stub program that creates 2 vehicles, 
 * changes their fields and gives back their state
 *
 ****************************************************************************/


//****************************************************************************
public class Main {
	//This class tests the stack
	
	//-----------------------
	public static void main(String[] args) throws Exception {
		//instantiate a stack object and insert/remove stuff
		
		//Bike 1
		System.out.println("Bike 1-----------");
		//instantiate new vehicle
		Bike Bike1 = new Bike("Plate", "Orange");
		System.out.println("Number of doors: "+Bike1.getNumberOfDoors());
		System.out.println("Speed: "+Bike1.getSpeed());
		Bike1.Accelerate(5.0);
		System.out.println("Speed: "+Bike1.getSpeed());
		Bike1.Accelerate(10);
		System.out.println("Speed: "+Bike1.getSpeed());
		Bike1.Accelerate(100);
		System.out.println("Speed: "+Bike1.getSpeed());
		Bike1.Decelerate(1);
		System.out.println("Speed: "+Bike1.getSpeed());
		System.out.println(Bike1.All());
		

		//Truck 2
		System.out.println("\nTruck 2-----------");
		//instantiate new vehicle
		//Vehicle vehicle2 = new Vehicle();
		Truck Truck2 = new Truck("POI0987", "Black");
		System.out.println("Number of doors: "+Truck2.getNumberOfDoors());
		System.out.println("Speed: "+Truck2.getSpeed());
		Truck2.Accelerate(5.0);
		System.out.println("Speed: "+Truck2.getSpeed());
		Truck2.Accelerate(10.2);
		System.out.println("Speed: "+Truck2.getSpeed());
		Truck2.Accelerate(300);
		System.out.println("Speed: "+Truck2.getSpeed());
		Truck2.Decelerate(100.0);
		System.out.println("Speed: "+Truck2.getSpeed());
		System.out.println(Truck2.All());
	}
}
