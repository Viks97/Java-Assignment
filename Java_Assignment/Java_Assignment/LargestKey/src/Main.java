import java.util.*;
import java.util.Map.Entry;  
public class Main {  
     public static void main(String args[]) {
  // Create a tree map
  TreeMap < Integer, String > trarr = new TreeMap < Integer, String > ();
  // Put elements to the map 
  trarr.put(1, "Viks");
  trarr.put(2, "Vinayak");
  trarr.put(4, "Nishchay");
  trarr.put(5, "Sneha");
  trarr.put(6, "Vivek");

  System.out.println("Orginal TreeMap content: " + trarr);
  System.out.println("Checking the entry for 1: ");
  System.out.println("Value is: " + trarr.floorEntry(1));
  System.out.println("Checking the entry for 2: ");
  System.out.println("Value is: " + trarr.floorEntry(3));
  System.out.println("Checking the entry for 5: ");
  System.out.println("Value is: " + trarr.floorEntry(7));
 }
}
