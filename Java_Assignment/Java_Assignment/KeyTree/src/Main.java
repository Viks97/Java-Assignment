import java.util.*;  
public class Main {  
   public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  // Put elements to the map 
  tree_map1.put("1", "Vinayak");
  tree_map1.put("2", "Nishchay");
  tree_map1.put("3", "Vivek");
  tree_map1.put("4", "Sneha"); 
    
  System.out.println(tree_map1);
        if(tree_map1.containsKey("1")){
            System.out.println("The Tree Map contains key 1");
        } else {
            System.out.println("The Tree Map does not contain key 1");
        }
        if(tree_map1.containsKey("5")){
            System.out.println("The Tree Map contains key 5");
        } else {
            System.out.println("The TreeMap does not contain key 5");
        }
    }
}
