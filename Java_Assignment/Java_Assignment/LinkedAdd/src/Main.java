
import java.util.LinkedList; 
  
public class Main { 
   public static void main(String args[]) { 
  
     
      LinkedList<String> l = new LinkedList<>(); 
  
      // use add() method to add elements in the list 
      l.add("Viks"); 
      l.add("DXC"); 
      l.add("Space"); 
      l.add("Java"); 
      l.add("Angular"); 
  
      // Output the present list 
      System.out.println("The list is:" + l); 
  
      // Adding new elements to the end 
      l.add("Hello"); 
      l.add("End"); 
  
      // printing the new list 
      System.out.println("The new List is:" + l); 
   } 
}