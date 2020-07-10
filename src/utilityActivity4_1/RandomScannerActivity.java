package utilityActivity4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random indexGen=new Random();
		
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter the Range");
		System.out.println("Non-Integer to Terminate");
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
			
		}
		
		Integer num[]=list.toArray(new Integer[0]);
		int Index=indexGen.nextInt(num.length);
		System.out.println("Index value Generated-"+Index);
		System.out.println("value in the Array Genertaed Index-"+num[Index]);

	}

}
