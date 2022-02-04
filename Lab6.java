
public class Lab6 {
	
	public static String starString(int n) {
		
		if(n < 0)
			throw new IllegalArgumentException();
		else if(n==0)
			return "*";
		else
			return starString(n-1) + starString(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(starString(0));
		System.out.println(starString(1));
		System.out.println(starString(2));
		System.out.println(starString(3));
		System.out.println(starString(4));
	}

}
