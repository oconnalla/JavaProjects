package ch5;
import java.util.Random;


public class randomDice {
	public static void main(String[] args) {
	Random rand = new Random();
	int newRand = rand.nextInt(6) + 1;
	int newRand2 = rand.nextInt(6) + 1;
	
	checkDice(newRand, newRand2);

	}
	public static void checkDice(int a, int b) {
		if(a + b == 7) {
			System.out.println("You rolled " + a + " and " + b + "! You got seven!");
		}else {
			System.out.print("You rolled " + a +" and " + b + ", which adds to " +(a + b) + ", better luck next time!");
		}
	}
}