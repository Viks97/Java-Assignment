// Java program for reversing a linked list using 
// In-built collections class 
import java.util.*; 

public class Main { 
	public static void main(String[] args) 
	{ 
		// Declaring linkedlist without any initial size 
		LinkedList<Integer> linkedli = new LinkedList<Integer>(); 

		// Appending elements at the end of the list 
		linkedli.add(new Integer(1)); 
		linkedli.add(new Integer(2)); 
		linkedli.add(new Integer(3)); 
		linkedli.add(new Integer(4)); 
		linkedli.add(new Integer(5)); 
		System.out.print("Elements before reversing: " + linkedli); 

		// Collections.reverse method takes a list as a 
		// parameter and returns the reversed list 
		Collections.reverse(linkedli); 

		System.out.print("\nElements after reversing: " + linkedli); 
	} 
} 
