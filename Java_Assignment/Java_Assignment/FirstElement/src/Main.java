import java.util.*;
public class Main {
 public static void main(String[] args) {
 
  LinkedList <String> arr = new LinkedList <String> ();
            arr.add("Red");
          arr.add("Green");
          arr.add("Black");
          arr.add("White");
          arr.add("Pink");
          System.out.println("Original linked  list: " + arr);
           
     System.out.println("Removed element: "+arr.pop());
     
     System.out.println("Linked list after pop operation: "+arr);
  }
} 