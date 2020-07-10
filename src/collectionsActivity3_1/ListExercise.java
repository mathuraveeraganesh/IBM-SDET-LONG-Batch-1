package collectionsActivity3_1;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {
		List<String> myList=new ArrayList<>();
		myList.add("mahesh");
		myList.add("Suresh");
		myList.add("Guru");
		myList.add(3,"Raju");
		
		for (String eachList : myList) {
			System.out.println(eachList);
		}
		System.out.println("Third name-"+myList.get(2));
		System.out.println("Suresh name exist-"+myList.contains("Suresh"));
		System.out.println("Number of name in the List-"+myList.size());
		myList.remove(1);
		System.out.println("Number of name in the List-"+myList.size());
		
	}

}
