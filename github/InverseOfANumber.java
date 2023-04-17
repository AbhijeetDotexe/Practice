import java.io.*;
import java.util.*;

public class InverseOfANumber {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int inv = 0;
		int originalPlace = 1;
		while(n!=0){
			int originalDigit = n%10;
			int invertDigit = originalPlace;
			int invertedPlace = originalDigit;
		//make change to inv using invertedPoistion and invertedDigit
			inv = inv + invertDigit*(int)Math.pow(10, invertedPlace-1);
			n = n/10;
			originalPlace++;
		}
		System.out.println(inv);
	}
}