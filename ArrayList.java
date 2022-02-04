import java.io.*; 
import java.util.*; 
  
public class ArrayList { 
    public static void main(String args[]) 
    { 
        // Creating an empty Set 
        Set<Integer> s = new HashSet<Integer>(); 
  
        // Use add() method to add elements into the Set 
        s.add(4);
        s.add(15);
        s.add(73);
        s.add(84);
        s.add(247);
        s.remove(15);
        s.add(42);
        s.add(12);
        s.remove(73);
        s.add(94);
        s.add(11);


        // Displaying the Set 
        System.out.println("Set: " + s); 
        
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(7, "Marty");
        map.put(34, "Louann");
        map.put(27, "Donald");
        map.put(15, "Moshe");
        map.put(84, "Larry");
        map.put(7, "Ed");
        map.put(2350, "Orlando");
        map.remove(8);
        map.put(5, "Moshe");
        map.remove(84);
        map.put(17, "Steve");
        
        System.out.println("Map: " + map); 
    } 
} 