package ch8;

public class ClientApp {
	public static void main(String[] args) {

		Product p1 = new Product(12323, "Buzz Lightyear", 15.99, 1);
		Product p2 = new Product(45635, "vintage nightstand", 25.00, 5);
		Product p3 = new Product(12398, "english fern", 10.99, 7);
		

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
