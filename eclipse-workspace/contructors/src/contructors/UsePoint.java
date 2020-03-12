package contructors;

public class UsePoint {
	public static void Main(String[] args) {
		Point p = new Point(1, 2);

		double d = p.distanceFromOriginal();
		System.out.println("Distance:  " + d);
		p.translate(4, 3);

		Point[] points = new Point[2];
		points[0] = new Point(2, 3);
		points[1] = new Point(2, 5);

		for (int point = 0; point < points.length; point++) {
			System.out.println(points[point]);
		}
	}

}
