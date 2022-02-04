import java.util.*;

public class CountUnique {
	
	public static int countUnique(List<Integer> list) {
			
		Set<Integer> s = new TreeSet<>();
			
		for (int i = 0; i < list.size(); i++) {
				
				s.add(list.get(i));
	        
			}
	        
			return s.size();
	    }

	    public static void main(String[] args) {
	    	
	    	System.out.println(countUnique(new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15))));
	    
	    }
}
