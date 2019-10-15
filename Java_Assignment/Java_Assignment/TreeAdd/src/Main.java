// Java code to illustrate add() 
import java.io.*; 
import java.util.TreeSet; 

public class Main { 
	public static void main(String args[]) 
	{ 
		// Creating an empty TreeSet 
		TreeSet<String> tree = new TreeSet<String>(); 

		// Use add() method to add elements into the Set 
		tree.add("Welcome"); 
		tree.add("To"); 
		tree.add("Sneha"); 
		tree.add("4"); 
		tree.add("Sneha"); 
		tree.add("TreeSet"); 

		// Displaying the TreeSet 
		System.out.println("TreeSet: " + tree); 
	} 
} 
