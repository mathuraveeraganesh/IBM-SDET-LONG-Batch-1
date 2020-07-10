package collectionsActivity3_1;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashExercise {

	public static void main(String[] args) {
		Set<String> hs=new LinkedHashSet<>();
		hs.add("mahesh");
		hs.add("guru");
		hs.add("hari");
		hs.add("dinesh");
		hs.add("senthil");
		hs.add("ramesh");
		System.out.println("Size of the Hash-"+hs.size());
		System.out.println("Removed guru Sucessfully-"+hs.remove("guru"));
		System.out.println("Remove suresh failed-"+hs.remove("suresh"));
		System.out.println("Checked hari is exits in set-"+hs.contains("hari"));
		System.out.println("Size of the Hash-"+hs.size());
		
		

	}

}
