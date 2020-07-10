package oopsActivity2_2;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		Plane plane=new Plane(10);
		plane.onboard("Mahesh");
		plane.onboard("Guru");
		System.out.println("Plane Take Off Date-"+plane.takeOff());
		System.out.println("Total Passenger-"+plane.getPassesngers());
		Thread.sleep(4000);
		plane.land();
		System.out.println("Plane landed At-"+plane.getLastTimeLanded());
		System.out.println("Total passenger-"+ plane.getPassesngers());

	}

}
