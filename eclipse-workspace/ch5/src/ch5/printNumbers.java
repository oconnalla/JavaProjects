package ch5;

public class printNumbers{
	public static void main(String[] args) {
		printNumber(5);
		
	
	};
	
	public static int printNumber(int num) {
		if(num == 1) {			
			System.out.print(num);
			return num;
		}else{
			System.out.print(num  + ",");
			printNumber(num -1);
			return num;
		}
	}
}
