import java.util.*;
public class GuessingGame {
	public static void main(String[] args) {
		game();
		
	}
	public static void game(){
		Random rand = new Random();
		int newRand = rand.nextInt(9) + 1;
		System.out.println ("secret number: "  + newRand);
		int counter= 1;
		System.out.print("Guess a number: ");
		Scanner input = new Scanner(System.in);
		int response =  input.nextInt();
		
		if(response!= newRand){
			counter++;
			do {	
				System.out.print("Close but not quite! Guess another number: ");
				 input = new Scanner(System.in);
				 response = input.nextInt();
				
					if(response > newRand) {
						System.out.print("Your guess is too high! ");
						counter ++;
					}else if(response < newRand) {
						System.out.print("Your guess too low! ");
						counter ++;
					}
			}while(response != newRand);
		}
		if(counter == 1) {
			System.out.print("That is correct! "+ newRand +" was the number! You took " + counter + " guess! ");
		}else {
		System.out.print("That is correct! "+ newRand +" was the number! You took " + counter + " guesses! ");
		}
	}
}
