import java.util.*;  
public class Main {  
  public static void main(String args[]){  
   // Create a tree map
   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
  // Put elements to the map 
  tree_map.put(5, "Red");
  tree_map.put(2, "Green");
  tree_map.put(4, "Black");
  tree_map.put(3, "White");
  tree_map.put(1, "Blue");
    
   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
   {
    System.out.println(entry.getKey() + "=>" + entry.getValue());
   }
 }  
}
