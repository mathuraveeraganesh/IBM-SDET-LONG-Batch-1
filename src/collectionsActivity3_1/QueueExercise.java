package collectionsActivity3_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		System.out.println("Print the Queue-"+q);
		q.remove();   //To remove the head of queue.
		System.out.println("First number in queue-"+q.peek());
		System.out.println("Size ot the queue-"+q.size());
		System.out.println("Print the Queue-"+q);
		

	}

}
