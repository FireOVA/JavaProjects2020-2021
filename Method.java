
public class Method {
	  
	static StringBuffer x = new StringBuffer();
	    
	public static String repeat(String s, int n) {
	        
	        if(n==0) {
	            
	        	String str = x.toString();
	            x.delete(0,x.length());
	            return str;
	        }
	        
	        else {
	            x.append(s);
	            return repeat(s,n-1);
	        }
	    }
	    
	        public static void main(String[] args) {
	        	
	                System.out.println(repeat("hello",3));
	                System.out.println(repeat("OK",1));
	                System.out.println(repeat("bye",2));
	        
	}

}
