import java.util.*;
//import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		List<String> list_Strings = new ArrayList<String>();
		
		 
//			System.out.println("Enter Array elements");
//			Scanner in = new Scanner(System. in);
//			String s= in.nextLine();
//			list_Strings.add(s);
//			
//			System.out.println(list_Strings);
		
		list_Strings.add("Vinayak");
		list_Strings.add("Vivek");
		list_Strings.add("Nishchay");
		list_Strings.add("Sneha");
		list_Strings.add("Viks");
		
		System.out.println(list_Strings);
		
		list_Strings.add(0, "DXC");
		
		
		System.out.println(list_Strings);

	}

}


