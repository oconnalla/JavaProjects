//*******************************************************************

//  isSorted
//
//list a list and checks that is is sorted and returns a boolean value

//By: Ariel OConnall
//Date 2/24/20
//*******************************************************************
package ch7;

public class IsSorted {
	public static void main(String[] args) {
		int[] data = {1,2,3,5,6};
		int[] data2 = {4,5,9,1,2,3,5,6};
		System.out.println(isSorted(data));
		System.out.println(isSorted(data2));
	}
		
	public static boolean isSorted(int[] list){
		int counter = 0;
		for(int i = 1; i < list.length; i++){
				if(list[i] >= list[i - 1]) {
					counter++;
				}
				if(counter == (list.length -1)) {
					return true;
				}
		}
		return false;

	}
}
