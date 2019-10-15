arrimport java.util.*;
import java.util.Map.Entry;  
public class Main {  
       public static void main(String args[]) {

  // Create a tree map
  TreeMap < Integer, String > trarr = new TreeMap < Integer, String > ();

  // Put elements to the map 
  trarr.put(10, "Red");
  trarr.put(20, "Green");
  trarr.put(40, "Black");
  trarr.put(50, "White");
  trarr.put(60, "Pink");

  System.out.println("Orginal TreeMap content: " + trarr);
  System.out.println("Checking the entry for 10: ");
  System.out.println("Key(s): " + trarr.headMap(10));
  System.out.println("Checking the entry for 30: ");
  System.out.println("Key(s): " + trarr.headMap(30));
  System.out.println("Checking the entry for 70: ");
  System.out.println("Key(s): " + trarr.headMap(70));
 }
}
