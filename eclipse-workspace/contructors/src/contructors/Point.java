package contructors;

public class Point {
	private int x;
	private int y;

	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;

	}

	public static void highPoint() {
		System.out.println("Hi from the static method!");
	}

	public double distanceFromOriginal() {
		return Math.sqrt(x * x + y * y);
	}

	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
