package javaActivity1_2;
/*
 * 

In this activity, we are writing a program to check if the sum of all the 10's in the array
 is exactly 30. The program returns false if the condition does not satisfy, 
 otherwise returns true.

Instructions:

    Create a Package named JavaActivity2.
    Add a Class named Activity2.
    In the main() method:
        Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
        Find the 10's in the array and add them
        Check if value is equal to 30.


 */
public class Activity2 {
	public static void main(String[] args) {
		int[] num= {10,77,10,54,-11,10};
		int add=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]==10) {
				add+=num[i];
			}
		}
		if(add==30)
			System.out.println("Value is Equal to 30");
		else
			System.out.println("Value is Not Equal to 30");
	
	}
}
