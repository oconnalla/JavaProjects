
public class RocketShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i =0; i<1; i++){
            drawBox1();
            drawBox2();
            drawCountry();
            drawBox2();
            drawBox1();
        }

	}
	
    public static void drawBox1(){
        String top = "  /\\";
        String mid = " /  \\";
        String bottom = "/    \\";
        System.out.println(top);
		System.out.println(mid);
		System.out.println(bottom);
    }
    public static void drawBox2(){
    	String hor = "+----+";
        String mid = "|    |";
        System.out.println(hor);
		System.out.println(mid);
		System.out.println(mid);
		System.out.println(hor);
    }
    public static void drawCountry(){
    	String hor = "|United|";
        String mid = "|States|";
        System.out.println(hor);
		System.out.println(mid);
    }
    

}
