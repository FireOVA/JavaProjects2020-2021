
public class Point implements Comparable{
	
	private int x;
	private int y;
	
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		setLocation(x, y);
	}
	
	public void setLocation(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();		
		}
		
		this.x = x;
		this.y = y;
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public int compareTo(Object o) {
        if (this == o) return 0;
        Point point = (Point) o;
        if(y ==  point.getY()) {
            return x-point.getX();
        }
        else {
            return y-point.getY();
        }
	
	}	
}

