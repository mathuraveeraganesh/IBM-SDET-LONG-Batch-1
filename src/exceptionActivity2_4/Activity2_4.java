package exceptionActivity2_4;

public class Activity2_4 {

	public static void main(String[] args) {
		try {
			Activity2_4.exceptionTest("print in console");
			Activity2_4.exceptionTest(null);
			Activity2_4.exceptionTest("won't execute");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void exceptionTest(String str) throws CustomException {
		if(str==null) {
			throw new CustomException("String is Null");
		}
		else {
			System.out.println(str);
		}
	}

}
