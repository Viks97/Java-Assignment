import java.util.LinkedList;
public class Main {

  public static void main(String[] args) {
     LinkedList<String> l = new LinkedList<String>();
     l.add("AA");
     l.add("BB");
     l.add("CC");
     l.add("AA");
     l.add("DD");
     l.add("AA");
     l.add("EE");
     System.out.println("LinkedList elements: "+l); 
     System.out.println("LastIndex of AA:"+l.lastIndexOf("AA"));
     System.out.println("LastIndex of ZZ:"+l.lastIndexOf("ZZ"));
  }
}