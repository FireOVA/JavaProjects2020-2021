import java.util.*;

public class Lab8 {
	

	    static void repeat(Stack<Integer> p) {
	        
	        Integer arr[] = new Integer[p.size()];
	        
	        int u = 0;
	        
	        while (!p.empty()) {
	            arr[u++] = p.peek();
	            p.pop();
	        }
	       
	        for (int i = arr.length - 1; i >= 0; i--) {
	            p.push(arr[i]);
	            p.push(arr[i]);
	        }
	    }

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	    	Integer[] data = {-1, 4, 7, 12, 5, -10};
	        
	        Stack<Integer> s = new Stack<Integer>();
	        
	        for(Integer n : data) s.push(n);
	        
	       System.out.println("before = " + s);
	       
	        repeat(s);
	        
	        System.out.println("after = " + s);
	}
}

