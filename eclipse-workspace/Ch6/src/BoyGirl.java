//*******************************************************************

//  boyGirl
//
//takes a file of boys and girls along with their scores, adds each gender's score 
//to make a total score for each gender. It returns the difference between their total 
//scores and the total size of each gender's group;

//By: Ariel OConnall
//Date 2/17/20
//*******************************************************************

import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.*;

public class BoyGirl {
	public static void main(String[] args)throws FileNotFoundException{
		Scanner input = new Scanner(new File("boyGirls.txt"));
		boyGirl(input);
		
	}
	public static void boyGirl(Scanner input){
		int boyTotal=0;
		int girlTotal=0;
		int total=0;
		int boySum = 0;
		int girlSum = 0;
		
	    List<String> nameArr = new ArrayList<String>();
	    List<Integer> numArr = new ArrayList<Integer>();
		while (input.hasNext()){
			String name = input.next();
//			total ++;
			numArr.add(input.nextInt());
			nameArr.add(name);			
		}
		if(nameArr.size() %2 != 0){
			boyTotal = (nameArr.size()/2) + 1;
			girlTotal = (nameArr.size()/2);
			
		}else {
			boyTotal = (nameArr.size()/2);
			girlTotal = (nameArr.size()/2);
		}
		for(int i = 0; i < numArr.size(); i++) {
			if (i % 2 != 0){
				girlSum += numArr.get(i);
			}else {
				boySum += numArr.get(i);
			}
			
			if(girlSum > boySum) {
				total= girlSum - boySum;
			} else {
				total = boySum - girlSum;
			}
			
		}
		System.out.println(boyTotal + " boys, " + girlTotal + " girls");
		System.out.println("Differences between boys' and girls' sums: " + total);
	}

}
