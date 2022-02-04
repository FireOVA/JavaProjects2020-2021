
public class MooMain {
	public static void main(String[] args) {
		   Moo[] elements = { new Shoe(), new Flute(), new Moo(), new Blue() };
		   for (int i = 0; i < elements.length; i++) {
		      System.out.print(elements[i] + " ");
		      elements[i].method1();
		      elements[i].method2();
		      System.out.println();
		   }
	}
}
