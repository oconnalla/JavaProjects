
public class IsPower {
	public static void main(String[] args){
		System.out.print(isPowerOfTwo(6));
	}
	public static boolean isPowerOfTwo(int n){
		boolean checker = false;
		if(n <= 0 ) {
			checker = false;
		} else {
			double compare = 0;
			int counter = 0;
			while( compare < n) {
				compare = Math.pow(2, counter);
				counter ++;
			}
			if(compare == n ) {
			checker = true;
			}
		}
		return checker;
	}
}