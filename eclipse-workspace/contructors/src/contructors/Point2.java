package contructors;

public class Point2 {
	private int x;
	private int y;

	public Point2() {
		this(0, 0);

	}

	public Point2(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
	}

}
