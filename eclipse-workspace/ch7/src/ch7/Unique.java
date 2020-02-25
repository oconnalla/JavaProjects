//*******************************************************************

//  isSorted
//
//takes an array and returns a boolean of if the numbers are unique

//By: Ariel OConnall
//Date 2/24/20
//*******************************************************************
package ch7;
import java.util.Arrays;

public class Unique {
	public static void main(String[] args) {
		int[] data = {1,2,3,5,6};
		int[] data2 = {4,5,9,1,2,3,5,6};
		int[] data3 = {1,9,9,12,1, 3,5,6};
		int[] data4 = {1,12,43,65,66,87};
		System.out.println(isUnique(data));
		System.out.println(isUnique(data2));
		System.out.println(isUnique(data3));
		System.out.println(isUnique(data4));
		
		//check original array was not sorted
		System.out.println("example, checking to make sure original arrays are unsorted: " + Arrays.toString(data3));
	}
	public static boolean isUnique(int[] list){
		//put array in order to check value adjacent to it.
		//make new temp array to not disturb original array
		 int[] temp = list.clone();
		 Arrays.sort(temp);
		 int count=0;
		 for(int i = 1; i < temp.length; i++){
			 //break statement as soon as first incidence of duplicate
			if(temp[i] <= temp[i - 1]){ 
				return false;
			}
		}//end of for loop
		 return true;
	}//end of function		
} //end of class


