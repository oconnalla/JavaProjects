package ch5;

public class primeNumbers {
	public static void main(String[] args) {
		showPrime(50);
	}
	public static void showPrime(int max) {
		for(int  i =0; i < max; i++){
			if(max <= 5) {
				System.out.print("2, 3, 5");
			}else if(i % 2 != 0 && i % 3 !=0 && i % 5 != 0) {
				System.out.print(i + ",");
			}
			
//			if(max % 2 != 0 && max % 3 != 0) {
//				System.out.print(max);
//				showPrime(max-1);
//			}
		}
		
	}

}
