package javaActivity1_1;


/*
 * 

    Create a Package named JavaActivity1.
    Add Classes Activity1 and Car to it. The Car class will not have the main() method.
    In the Car class, add the variables,
        A String color
        A String transmission
        An int make
        An int tyres
        An int doors
    Make a constructor to initialize tyres to 4 and doors to 4
    Create methods
        displayCharacteristics() - This displays the values of all the variables
        accelarate() - This prints "Car is moving forward."
        brake() - This prints "Car has stopped."


 */


public class Activity1 {
	
	
	public static void main(String[] args) {
		Car Print=new Car();
		Print.color="Black";
		Print.transmission="Automatic";
		Print.make=2019;
		Print.displayCharacteristics();
		Print.accelarate();
		Print.brake();
	}

 

}