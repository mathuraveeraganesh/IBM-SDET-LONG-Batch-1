package collectionsActivity3_1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueExercise {

	public static void main(String[] args) {
		Deque<String> dq=new LinkedList();
		dq.add("lion");
		dq.add("tiger");
		dq.add("deer");
		dq.add("wolf");
		dq.add("pig");
		dq.add("elephant");
		
		Iterator<String> iteartor=dq.iterator();
		while(iteartor.hasNext()) {
			System.out.println(iteartor.next())
			;
		}
		System.out.println("Head Element-"+dq.peekFirst());
		System.out.println("tail Element-"+dq.peekLast());
		System.out.println("Check wolf present in the queue-"+dq.contains("wolf"));
		System.out.println("Remove head elemment-"+dq.removeFirst());
		System.out.println("Remove tail elemment-"+dq.removeLast());
		System.out.println(dq);
		System.out.println("size ot the dequeue-"+dq.size());
		
		System.out.println("Offer Added-"+dq.offer("Gorilla"));
		System.out.println("Offer First Added-"+dq.offer("Monkey"));
		System.out.println("Offer Last Added-"+dq.offer("Donkey"));
		System.out.println(dq);
		
		System.out.println("removing head element-"+dq.poll());
		System.out.println(dq);
		System.out.println("removing first element-"+dq.pollFirst());
		System.out.println(dq);
		System.out.println("removing last element-"+dq.pollLast());
		System.out.println(dq);
		

	}

}
