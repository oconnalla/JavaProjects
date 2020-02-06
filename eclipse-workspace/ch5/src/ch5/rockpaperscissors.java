package ch5;
import java.util.Random;
//simport java.util.Scanner;


public class rockpaperscissors {
	public static void main(String[] args){
		Random rand = new Random();
		int newRand = rand.nextInt(3);
		if(newRand == 1) {
			System.out.print("rock");
		}else if(newRand == 2) {
			System.out.print("paper");
		}else {
			System.out.print("scissors");	
		}
		
	}
}
