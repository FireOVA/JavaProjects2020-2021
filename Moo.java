
public class Moo {
	 public void method1() {
	      System.out.print("moo1");
	  }

	   public void method2() {
	      System.out.print("moo 2");
	      method1();

	   }

	   public String toString() {
	      return "moo";
	   }
}
