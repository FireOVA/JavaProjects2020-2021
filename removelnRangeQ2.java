import java.util.*;

public class removelnRangeQ2 {
	
	public static void removelnRange(LinkedList<Integer> list, int element, int startIndex, int endIndex) {
		
			while(startIndex < endIndex) {
				if(list.get(startIndex) == element) {
					list.remove(startIndex);
					endIndex--;
				}
				else {
					startIndex ++;
				}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(0);
		l.add(0);
		l.add(2);
		l.add(0);
		l.add(4);
		l.add(0);
		l.add(6);
		l.add(0);
		l.add(8);
		l.add(0);
		l.add(10);
		l.add(0);
		l.add(12);
		l.add(0);
		l.add(14);
		l.add(0);
		l.add(16);
		System.out.println("Before: " + l);
		
		removelnRange(l, 0, 5, 13);
		
		System.out.println("After: " + l);
		
	}

}
