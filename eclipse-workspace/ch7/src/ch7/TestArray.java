package ch7;
import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		//create an array
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;

		
		reversed(numbers);
		Arrays.toString(numbers);
		System.out.println(Arrays.toString(numbers));
	}
 
	public static void reversed(int[] numbers) {			 
		int iteration = 0;
		for(int i = numbers.length -1; i >-1; i--){
			int temp = numbers[i];
			int val = 10;
			//numbers[9] = numbers[0]
			 numbers[i] = numbers[numbers.length - val];

			 System.out.println(numbers[i] +" " + iteration);
			 iteration++;
			 //numbers[0] = 
			 numbers[numbers.length - val ] = temp;
			 val --;
		}
 }

//		
//		numbers[0] = 42;
//		numbers[5]= 7;
//		System.out.println(Arrays.toString(numbers));
//		
//		
//		double[][] temp = new double[3][5]; //3 rows, 5 columns
//		
//		temp[0][0] = 98.3;
//		temp[0][1] = 85.1;
//		temp[0][2] = 77.4;
//		temp[0][3] = 70.5;
//		temp[0][4] = 88.9;
//	
//		
//		System.out.print("After: " + Arrays.deepToString(temp));
//	};
//	public static void print(double[][] temp ) {
//		for(int i = 0; i<temp.length; i++) {
//			for(int j = 0; j<temp.length; j++) {
//				System.out.println(temp[i][j]);
//				
//			}
//		}
			
	}

