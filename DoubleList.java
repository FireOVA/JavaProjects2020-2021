import java.util.*;

public class DoubleList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("This", "is", "Lab", "Four"));
		System.out.println("Before = " + list);
		doubleList(list);
		System.out.println("After = " + list);
	}

	private static void doubleList(ArrayList<String> list) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i += 2) {
			list.add(i, list.get(i));
		}
	}

}
