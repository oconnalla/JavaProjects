import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class TestFile {
	
	public static void main(String[] args) throws FileNotFoundException
	{
//		File f = new File("Hamlet.txt");
//		System.out.println("Exists returns: " + f.exists());
//		System.out.println("canRead returns: " + f.canRead());
//		System.out.println("Length returns: " + f.length());
//		System.out.println("Absolute path returns: " + f.getAbsolutePath());
//		
//		PrintStream output = new PrintStream(new File("Hello.txt"));
//		output.println("Hello world!");
//		output.println();
//		output.println("This output produces");
//		output.println("four lines of output");
//		output.println("The old content is gone");
//		
//		output.close();
//		Scanner input = new Scanner(new File("weather.txt"));
//		double prev = input.nextDouble(); //fencepost
//		while(input.hasNextDouble()) {
//			double next = input.nextDouble();
//			System.out.print(prev + " to " +  next + ", change = " + (next - prev));
//			prev = next;
//		}
		int a = 30;
		int b = 0;

		try {
			int c = a/b;
			System.out.println("result = " + c);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.print("Can't divide a number by 0");
		}
		
	}

}
