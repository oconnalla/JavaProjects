
public class IsPower {
	public static void main(String[] args){
		System.out.println(isPowerOfTwo(6));
		System.out.println(isPowerOfTwo(8));
	}
	public static boolean isPowerOfTwo(int n){
		boolean checker = false;
		if(n <= 0 ) {
			checker = false;
		} else {
			//compare checks the answer when a power is run to see if it goes above n. 
			//If it's value is above n but never equals n then it's not a power of 2. 
			//counter is just an an incrementer.
			double compare = 0;
			int counter = 0;
			while(compare < n) {
				compare = Math.pow(2, counter);
				System.out.println("2 to the " + counter + " (counter) equals " + 
				(String.format("%f", compare).split("\\.")[0]) + " (compare).");
				counter ++;		
			}
			if(compare == n ) {
			checker = true;
			}
		}
		return checker;
	}
}