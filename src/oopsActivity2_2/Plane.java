package oopsActivity2_2;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 
Activity 2-2

In this activity we show implementation of Encapsulation.

There is a plane that can onboard passengers. Whenever plane takes off the date of taking off has to be updated. Same with landing.

Below is an implementation where everything is public, there are no methods and every operation requires changing the fields directly.

Our job is to make this implementation OOP friendly.

 */
public class Plane {
	private List<String> passengers;
	private Date lastTimeLanded;
	private int maxPassengers;
	private Date lastTimeTookOf;
	public Plane(int maxPassengers) {
		this.maxPassengers=maxPassengers;
		this.passengers=new ArrayList<>();
		
	}
	
public void onboard(String passengers) {
		
	this.passengers.add(passengers);
		
	}
	public Date takeOff() {
		this.lastTimeTookOf=new Date();
		return lastTimeTookOf;
		
	}
	public void land() {
		this.lastTimeLanded=new Date();
		this.passengers.clear();
		
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
    public List<String> getPassesngers() {
    	return passengers;
    }
   
    
    
}
