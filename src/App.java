

import java.util.LinkedList;
import java.util.Iterator;

public class App {
	
	
	
	public static void main(String [] args) {
		
		
		LinkedList<String> animals = new LinkedList<String>(); 
		
	
		String p1 = "Fox";
		String p2 = "Dog";
		String p3 = "Dinosaur";
		String p4 = "cat";
		String p5= "Wolf";
		String p6 = "rat";

		
		animals.add(p1);
		animals.add(p2);
		animals.add(p3);
		animals.add(p4);
		animals.add(p5);
		animals.add(p6);

		
		Iterator<String> it = animals.iterator();

		while(it.hasNext()) {
			
			String value = it.next(); 
			System.out.println(value);
			
		}
		
		
		
		
		///Modern iteration, post Java5
		  for(String elem: animals) {
			
			System.out.println(elem);

		}
		
	}

}
