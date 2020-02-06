package ch5;
import java.util.*;
//*******************************************************************
//printGPA
//
//Takes numerical value, returns GPA
//By: Ariel OConnall
//Date 2/4/20
//*******************************************************************
public class printGPA {
	public static void main(String[] args) {
		printGPA();

	}
	
	public static void printGPA(){
		System.out.print("Enter a student's record: ");
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		String[] arr = response.split(" ");
		String name = arr[0];
		String av = arr[1];
		double sum = 0;
		double avg= Integer.parseInt(av);
		double average = sum/avg;
		double number =0;

		for(int i = 2; i< arr.length; i++) {
			String val = arr[i];
			double num = Integer.parseInt(val);
			sum += num;
			average = sum/avg;
			number= Math.floor(average * 100) / 100;
		}
		System.out.println(name + "'s grade is: " + number);
	}

}
