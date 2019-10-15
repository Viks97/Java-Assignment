import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();

		
		arrList.add("100");
		arrList.add("200");
		arrList.add("300");
		arrList.add("400");
		arrList.add("500");

		
		boolean isFound = arrList.contains("300");
		if(isFound == false)
			System.out.println("Element is not found in the list");
		else
			System.out.println("Element is found in the list");

	}
}
