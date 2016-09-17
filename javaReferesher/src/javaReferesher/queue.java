//there are 5 parking spots increment the parking spot when each parking spot is filled
//once the parking spot is filled show a message the all parking spots are filled.
package javaReferesher;
import java.util.LinkedList; 

public class queue {
	private LinkedList<String> list = new LinkedList<String>(); 
	public void enqueue(String person) {
		list.addLast(person);  } 
	 
	 public String dequeue() {   return list.poll();  } 
	 
	 public boolean hasItems() {   return !list.isEmpty();  } 
	 
	 public int size() {   return list.size();  } 
	 
	} 
	  



