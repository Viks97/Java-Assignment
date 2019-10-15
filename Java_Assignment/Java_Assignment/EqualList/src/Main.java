import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      ArrayList<String> l1 = new ArrayList<String>();
      l1.add("Red");
      l1.add("Pink");
      l1.add("Yellow");
      l1.add("Black");
      ArrayList<String> l2 = new ArrayList<String>();
      l2.add("Red");
      l2.add("Pink");
      l2.add("Yellow");
      l2.add("Black");
      System.out.println(l2);
      System.out.println(l1.equals(l2));
   }
}