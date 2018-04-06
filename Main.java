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
		Bike Bike1 = new Bike("Yellow");
		Bike1.Accelerate(100);
		System.out.println("Accelerated 100");
		System.out.println(Bike1.All());

		//Truck 2
		System.out.println("\nTruck 2-----------");
		//instantiate new vehicle
		//Vehicle vehicle2 = new Vehicle();
		Truck Truck2 = new Truck("ABC1234", "Grey");
		Truck2.Accelerate(100);
		System.out.println("Accelerated 100");
		System.out.println(Truck2.All());
	}
}
