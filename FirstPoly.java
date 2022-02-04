
public class FirstPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First var1 = new Second();
		First var2 = new Third();
		First var3 = new Fourth();
		Second var4 = new Third();
		Object var5 = new Fourth();
		Object var6 = new Second();

		System.out.println("var1.method2()");
		var1.method2();
		//Second2
		
		System.out.println("var2.method2()");
		var2.method2();
		//Third2

		System.out.println("var3.method2()");
		var3.method2();
		//Fourth2

		System.out.println("var4.method2()");
		var4.method2();
		//Third 2

		//var5.method2();
		

		//var6.method2();
		
		//Compile error
		//Neither method 2 can be defined as objects when compiling 
		//Error appears before runtime 

		System.out.println("var1.method3()");
		var1.method3();
		//Second2

		System.out.println("var2.method3()");
		var2.method3();
		//Third2

		System.out.println("var3.method3()");
		var3.method3();
		//Fourth2

		System.out.println("var4.method3()");
		var4.method3();
		//Third2

		//var5.method3();
		//same as above 
		
		//var6.method3();
		//same as above 
		
		//((Second)var4).method1();
		// At runtime the class is recognized as the second type but second does not have method 1 so it is a compile error
		
		System.out.println("((Third)var4).method1()");
		((Third)var4).method1();
		//Third1 and Second2

		//((Second)var5).method2();
		// Runtime error as class Fourth cannot be cast to class Second
		//2 outputs come out but the classes are not capable of being combined 

		System.out.println("((First)var5).method3()");
		((First)var5).method3();
		//Fourth2

		//((Third)var5).method1();
		//Runtime Error
		//Since Third extends Second and Fourth extends First, the classes cannot be cast upon the other
		
		System.out.println("((First)var6).method3()");
		((First)var6).method3();
		//Second2

		//((Second)var6).method1();
		//Compile error
		// the Variable is recognized as second and second does not have method 1 
	}

}
