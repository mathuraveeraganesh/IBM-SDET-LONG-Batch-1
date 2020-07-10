package oopsActivity2_3;

public class Bicycle implements BicycleParts,BicycleOperations {

	int gears;
	int speed;
	
	public Bicycle(int gears2, int speed2) {
		this.gears=4;
		this.speed=30;
		
	}
	
	@Override
	public void applyBrake(int decrement) {
		System.out.println("Reduce Current Speed-"+(speed-decrement));
		
	}

	@Override
	public void speedUp(int increment) {
		System.out.println("Increase Current Speed-"+(speed+increment));
		
	}

	@Override
	public int gears() {
		
		return this.gears;
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return this.speed;
	}
	
	public String bicycleDesc() {
		return("Number of Gear-"+gears+"\nCurrent Speed of the Vehicle"+speed);
	}
}
