import java.util.*;

  public class Main {
  public static void main(String[] args) {
  
  List<String> list_Strings = new ArrayList<String>();
  
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  
  
  System.out.println(list_Strings);
  
 
  String element = list_Strings.get(0);
  System.out.println("First element: "+element);
  element = list_Strings.get(2);
  System.out.println("Third element: "+element);
 }
}
