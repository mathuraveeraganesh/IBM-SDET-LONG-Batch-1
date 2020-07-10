package oopsActivity2_3;

public class Activity2_3 {

	public static void main(String[] args) {
		MountainBike mountainbike=new MountainBike(3, 20, 4);
		System.out.print(mountainbike.bicycleDesc());
		mountainbike.applyBrake(5);
		mountainbike.speedUp(10);
	}

}
