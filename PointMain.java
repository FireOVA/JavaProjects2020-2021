import java.util.*;

public class PointMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(22, 12));
		points.add(new Point(3, 9));
		points.add(new Point(21, 8));  
		points.add(new Point(4, 8));   
		points.add(new Point(13, 5));
		
		System.out.println( "Before: " + points);
		
		Collections.sort(points);
		
		System.out.println("After: " + points);
	}

}
