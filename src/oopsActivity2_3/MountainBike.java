package oopsActivity2_3;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
		
	
	
	public MountainBike(int gears,int speed,int startHeight) {
		 super(gears,speed);
		 seatHeight=startHeight;
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	   
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+"\nHeight of the Seat"+seatHeight);
	}
}
