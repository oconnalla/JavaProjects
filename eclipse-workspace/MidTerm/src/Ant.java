import java.util.Random;

public class Ant {
	public static void main(String[] args) {

	Random rand = new Random();
	int newRand = rand.nextInt(2);
	antCrawl(newRand);
	}
	public static void antCrawl(int newRand) {
		int steps = 0;
		int falls = 0;
		do{
			Random rand = new Random();
			newRand = rand.nextInt(2);
			if(newRand == 1){
//				count++;
				steps ++;
			}else {
				falls ++;
				steps = 0;
			}
		}while(steps < 6);
		System.out.print("The total falls were: " + falls);
	}
	
}
