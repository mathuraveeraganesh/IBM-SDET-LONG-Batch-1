package exceptionActivity2_4;

public class CustomException extends Exception {
	private String Message=null;
	public CustomException(String Message) {
		this.Message=Message;
	}
	
	public String getMessage() {
	    return Message;
	}
}
