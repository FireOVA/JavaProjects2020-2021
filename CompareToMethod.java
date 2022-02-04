////////////////////////////////////////////////////////////
// <<<<Natural ordering and compareTo>>>
// public interface Comparable<T> {
//	public int compareTo(T other);
// }
//
// A negative number to indicate a less-than relationship
// 0 to indicate equality
// A positive number to indicate a greater-than relationship
////////////////////////////////////////////////////////////
public class CompareToMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = 7;  // Note: n1 is Integer class type NOT int primitive date type
		Integer n2 = 15;
		Integer n3 = 7;
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "hello";
		String s4 = "hell";
		String s5 = "hello12";
		
		System.out.println("Integer comparison");
		System.out.println(n1.compareTo(n2));
		System.out.println(n1.compareTo(n3));
		System.out.println(n2.compareTo(n3));
		
		System.out.println("String comparison");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s4));
	}

}
