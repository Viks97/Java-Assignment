import java.util.*; 
  
public class Main { 
    public static void main(String[] args) 
    {
        SortedMap<Integer, String> trarr = new TreeMap<>();   
        trarr.put(1, "One"); 
        trarr.put(2, "Two"); 
        trarr.put(3, "Three"); 
        trarr.put(4, "Four"); 
        trarr.put(5, "Five"); 
        // Returning the key ranging 
        // between 2 and 5 
        System.out.print("Elements in range from 2 to 5 in the map is : "
                         + trarr.subMap(1, 3)); 
    } 
} 