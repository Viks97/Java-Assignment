import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<String>();
    ll.add("Viks");
    ll.add("Vinayak");
    ll.add("Nishchay");
    ll.add("Sneha");
    ll.add("Vivek");
    
    for (String s: ll) {
    	System.out.println(s);
    }

    List<String> list = new ArrayList<String>(ll);

    for (String str : list){
      System.out.println(str);
    }
 }
}