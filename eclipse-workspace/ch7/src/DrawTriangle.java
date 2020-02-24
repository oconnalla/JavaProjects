
import java.awt.Color;

public class DrawTriangle {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300,200);
		Color[][] pixelColors = panel.getPixels();
		for(int row = 50; row <= 150; row++){
			for(int col = 50; col<= row; col++){
				pixelColors[row][col] = Color.MAGENTA;
			}//end of first for loop
		} //end of second for loop
		panel.setPixels(pixelColors);
		
	}// end of main

}//end of class

